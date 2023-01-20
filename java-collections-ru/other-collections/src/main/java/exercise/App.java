package exercise;

import java.util.Map;
import java.util.TreeMap;

// BEGIN
public class App {
    public static TreeMap<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        TreeMap<String, String> resulTreeMap = new TreeMap<>();

        for (Map.Entry<String, Object> x : map1.entrySet()) {
            if (map2.containsKey(x.getKey())) {
                Object map2Value = map2.get(x.getKey());
                resulTreeMap.put(x.getKey(), x.getValue().equals(map2Value) ? "unchanged" : "changed");
                map2.remove(x.getKey());
            } else {
                resulTreeMap.put(x.getKey(), "deleted");
            }
        }

        for (Map.Entry<String, Object> y : map2.entrySet()) {
            resulTreeMap.put(y.getKey(), "added");
        }

        return resulTreeMap;
    }
}
//END
