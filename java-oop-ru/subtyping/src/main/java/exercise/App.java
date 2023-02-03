package exercise;

import java.util.Map;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage map) {
        for (Map.Entry<String, String> entry : map.toMap().entrySet()) {
            String newKey = entry.getValue();
            String newValue = entry.getKey();
            map.unset(entry.getKey());
            map.set(newKey, newValue);
        }
    }
}
// END
