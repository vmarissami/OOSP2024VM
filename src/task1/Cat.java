package task1;

public class Cat implements Pet {
    @Override
    public void speak() {
        System.out.println("Кошка: Мяу-мяу!");
    }

    @Override
    public void action() {
        System.out.println("Кошка: Умывается лапкой");
    }
}
