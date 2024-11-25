package task1;

public class Dog implements Pet {
    @Override
    public void speak() {
        System.out.println("Собака: Гав-гав!");
    }

    @Override
    public void action() {
        System.out.println("Собака: Виляет хвостиком :3");
    }
}
