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
        StringBuilder result;
        result = new StringBuilder("<" + tagName);

        for (Map.Entry<String, String> entry : tagAttributes.entrySet()) {
            result.append(" ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
        }

        result.append(">");

        return result.toString();
    }
}
// END
