package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    Map<String, String> imStorage;

    public InMemoryKV(Map<String, String> initMap) {
        imStorage = new HashMap<>(initMap);
    }

    @Override
    public void set(String key, String value) {
        this.imStorage.put(key, value);
    }

    @Override
    public void unset(String key) {
        this.imStorage.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        if (this.imStorage.containsKey(key)) {
            return this.imStorage.get(key);
        }

        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(this.imStorage);
    }
}

// END
