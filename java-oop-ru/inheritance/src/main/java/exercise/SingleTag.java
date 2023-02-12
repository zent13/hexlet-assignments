package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String tagName, Map<String, String> tagAttributes) {
        this.tagName = tagName;
        this.tagAttributes = tagAttributes;
    }

    @Override
    public String toString() {
        String result;
        result = "<" + tagName;

        for (Map.Entry<String, String> entry : tagAttributes.entrySet()) {
            result += " " + entry.getKey() + "=\"" + entry.getValue() + "\"";
        }

        result += ">";

        return result;
    }
}
// END
