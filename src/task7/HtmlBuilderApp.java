package task7;

public class HtmlBuilderApp {
    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("html");

        builder.addChild("head")
                .addChild("title", "Пример HTML-документа");

        builder.addChild("body")
                .addChild("h1", "Добро пожаловать!")
                .addChild("p", "Это пример HTML-документа, созданного с использованием паттерна Строитель.")
                .addChild("ul")
                .addChild("li", "Элемент списка 1")
                .addChild("li", "Элемент списка 2")
                .addChild("li", "Элемент списка 3");

        HtmlElement document = builder.build();

        System.out.println(document);
    }
}
