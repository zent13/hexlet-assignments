package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String latters, String word) {
        List<String> lattersArray = new ArrayList<String>(Arrays.asList(latters.toLowerCase().split("")));
        List<String> wordArray = new ArrayList<String>(Arrays.asList(word.toLowerCase().split("")));
        boolean awr = true;

        for (String s: wordArray) {
            if (!lattersArray.contains(s)) {
                awr = false;
                break;
            } else {
                lattersArray.remove(s);
            }
        }

        return awr;
    }
}
//END
