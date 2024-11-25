package task12;

import java.util.ArrayList;
import java.util.List;

public class MenuCategory implements MenuComponent {
    private final String name;
    private final List<MenuComponent> menuComponents = new ArrayList<>();

    public MenuCategory(String name) {
        this.name = name;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public void print() {
        System.out.println("\nКатегория: " + name);
        System.out.println("--------------------");
        for (MenuComponent component : menuComponents) {
            component.print();
        }
    }
}
