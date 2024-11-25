package task12;

public class MenuItem implements MenuComponent {
    private final String name;
    private final int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Блюдо: " + name + ", Цена: " + price);
    }
}
