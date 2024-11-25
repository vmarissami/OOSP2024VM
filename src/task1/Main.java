package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в управление питомцами!");
        System.out.println("Доступные питомцы: собака, кошка, попугай.");

        while (true) {
            System.out.print("\nВведите тип питомца (dog, cat, parrot) или 'exit' для выхода: ");
            String petType = scanner.nextLine().toLowerCase();

            if (petType.equals("exit")) {
                System.out.println("Выход из программы. Спасибо за использование!");
                break;
            }

            PetFactory factory;
            switch (petType) {
                case "dog":
                    factory = new DogFactory();
                    break;
                case "cat":
                    factory = new CatFactory();
                    break;
                case "parrot":
                    factory = new ParrotFactory();
                    break;
                default:
                    System.out.println("Неверный тип питомца.");
                    continue;
            }

            Pet pet = factory.createPet();
            System.out.println("\nВаш питомец:");
            pet.speak();
            pet.action();
        }

        scanner.close();
    }
}
