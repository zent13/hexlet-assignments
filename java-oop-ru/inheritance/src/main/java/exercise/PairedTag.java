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
        String result;
        result = "<" + tagName;

        for (Map.Entry<String, String> entry : tagAttributes.entrySet()) {
            result += " " + entry.getKey() + "=\"" + entry.getValue() + "\"";
        }
        result += ">";

        for (Tag tag : tagChildes) {
            result += tag.toString();
        }

        result += tagBody + "</" + tagName + ">";

        return result;
    }
}
