package exercise;

import java.util.Map;
import java.util.List;

// BEGIN
public class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> tagChildes;

    public PairedTag(String tagName, Map<String, String> tagAttributes, String tagBody, List<Tag> tagChildes) {
        this.tagName = tagName;
        this.tagAttributes = tagAttributes;
        this.tagBody = tagBody;
        this.tagChildes = tagChildes;
    }

    @Override
    public String toString() {
        StringBuilder result;
        result = new StringBuilder("<" + tagName);

        for (Map.Entry<String, String> entry : tagAttributes.entrySet()) {
            result.append(" ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
        }
        result.append(">");

        for (Tag tag : tagChildes) {
            result.append(tag.toString());
        }

        result.append(tagBody).append("</").append(tagName).append(">");

        return result.toString();
    }
}
