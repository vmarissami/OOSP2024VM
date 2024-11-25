package task7;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    private String name;
    private String textContent;
    private List<HtmlElement> children;

    public HtmlElement(String name) {
        this.name = name;
        this.textContent = "";
        this.children = new ArrayList<>();
    }

    public HtmlElement(String name, String textContent) {
        this(name);
        this.textContent = textContent;
    }

    public void addChild(HtmlElement child) {
        children.add(child);
    }

    private String generateIndent(int indent) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            builder.append("  ");
        }
        return builder.toString();
    }

    private String render(int indent) {
        StringBuilder builder = new StringBuilder();
        String indentSpace = generateIndent(indent);

        builder.append(indentSpace).append("<").append(name).append(">\n");

        if (!textContent.isEmpty()) {
            builder.append(generateIndent(indent + 1))
                    .append(textContent)
                    .append("\n");
        }

        for (HtmlElement child : children) {
            builder.append(child.render(indent + 1));
        }

        builder.append(indentSpace).append("</").append(name).append(">\n");
        return builder.toString();
    }

    @Override
    public String toString() {
        return render(0);
    }
}
