package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AppTest {
    static List<Integer> testDataSet;

    @BeforeAll
    static void prepear() {
        testDataSet = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }

    @Test
    void testTake() {
        // BEGIN
        // #1.RIGHT.HappyPath. Count less than list.size
        List<Integer> expectedResult1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result1 = App.take(testDataSet, 3);

        assertThat(result1).isEqualTo(expectedResult1);

        // #2.RIGHT.HappyPath. Count more than list.size
        List<Integer> expectedResult2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> result2 = App.take(testDataSet, 7);

        assertThat(result2).isEqualTo(expectedResult2);

        // #3.RIGHT.CornerCase. Count=0
        List<Integer> expectedResult3 = new ArrayList<>(Arrays.asList());
        List<Integer> result3 = App.take(testDataSet, 0);

        assertThat(result3).isEqualTo(expectedResult3);

        // #4.RIGHT.CornerCase. Empty List<>
        List<Integer> testDataSetEmpty = new ArrayList<>(Arrays.asList());
        List<Integer> expectedResult4 = new ArrayList<>(Arrays.asList());
        List<Integer> result4 = App.take(testDataSetEmpty, 5);

        assertThat(result4).isEqualTo(expectedResult4);
        // END
    }
}
