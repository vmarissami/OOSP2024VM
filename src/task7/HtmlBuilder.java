package task7;

public class HtmlBuilder {
    private HtmlElement root;

    public HtmlBuilder(String rootName) {
        root = new HtmlElement(rootName);
    }

    public HtmlBuilder addChild(String name, String textContent) {
        HtmlElement child = new HtmlElement(name, textContent);
        root.addChild(child);
        return this;
    }

    public HtmlBuilder addChild(String name) {
        HtmlElement child = new HtmlElement(name);
        root.addChild(child);
        return this;
    }

    public HtmlElement build() {
        return root;
    }
}
