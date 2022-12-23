package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        //System.out.println("===================");
        List<Map<String, String>> result = new ArrayList<>();
        int whereLength = where.size();
        //System.out.println("whereLength: " + whereLength);

        for (Map<String, String> book : books) {
            //System.out.println("Book params: \n" + book);
            int count = 0;

            for (Map.Entry<String, String> w : where.entrySet()) {

                if (book.containsValue(w.getValue())) {
                    count++;
                }
                //System.out.println("w: " + w);
                //System.out.println("count: " + count);
            }

            if (count == whereLength) {
                result.add(book);
            }
        }

        //System.out.println("===================");
        return result;
    }
}

//END
