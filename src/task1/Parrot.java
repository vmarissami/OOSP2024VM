package task1;

public class Parrot implements Pet {
    @Override
    public void speak() {
        System.out.println("Попугай: Привет! Меня зовут Кеша!");
    }

    @Override
    public void action() {
        System.out.println("Попугай: Улетел...");
    }
}
