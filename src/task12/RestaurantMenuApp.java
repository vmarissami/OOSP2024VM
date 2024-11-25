package task12;

public class RestaurantMenuApp {
    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("Пицца", 108);
        MenuItem pasta = new MenuItem("Паста", 350);
        MenuItem salad = new MenuItem("Салат", 420);
        MenuItem burger = new MenuItem("Бургер", 330);
        MenuItem mochi = new MenuItem("Моти", 280);

        MenuCategory mainDishes = new MenuCategory("Основные блюда");
        MenuCategory appetizers = new MenuCategory("Закуски");
        MenuCategory desserts = new MenuCategory("Десерты");

        mainDishes.add(salad);
        mainDishes.add(pasta);

        appetizers.add(pizza);
        appetizers.add(burger);

        desserts.add(mochi);

        MenuCategory menu = new MenuCategory("Меню ресторана");
        menu.add(mainDishes);
        menu.add(appetizers);
        menu.add(desserts);

        menu.print();
    }
}
