package task3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в систему управления устройствами!");
        System.out.println("Доступные устройства: робот, дрон, автономный автомобиль.");

        while (true) {
            System.out.print("\nВведите тип устройства (robot, drone, car) или 'exit' для выхода: ");
            String deviceType = scanner.nextLine().toLowerCase();

            if (deviceType.equals("exit")) {
                System.out.println("Выход из программы. Спасибо за использование!");
                break;
            }

            System.out.print("Введите команду для устройства: ");
            String command = scanner.nextLine();

            RemoteDevice device;
            switch (deviceType) {
                case "robot":
                    device = new Robot(new RobotControl());
                    break;
                case "drone":
                    device = new Drone(new DroneControl());
                    break;
                case "car":
                    device = new AutonomousCar(new AutonomousCarControl());
                    break;
                default:
                    System.out.println("Неверный тип устройства.");
                    continue;
            }

            device.operate(command);
        }

        scanner.close();
    }
}
