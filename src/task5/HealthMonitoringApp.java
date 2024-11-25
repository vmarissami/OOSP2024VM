package task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HealthMonitoringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MedicalTest medicalTest = new MedicalTest();
        Map<String, Patient> patients = new HashMap<>();

        System.out.println("Система мониторинга здоровья запущена.");
        System.out.println("Введите 'add' для добавления пациента, 'remove' для удаления пациента, 'result' для ввода нового результата, или 'exit' для выхода.");

        while (true) {
            System.out.print("\nВведите команду: ");
            String command = scanner.nextLine().toLowerCase();

            if (command.equals("exit")) {
                System.out.println("Выход из системы мониторинга здоровья.");
                break;
            }

            switch (command) {
                case "add":
                    System.out.print("Введите имя пациента: ");
                    String patientName = scanner.nextLine();
                    if (patients.containsKey(patientName)) {
                        System.out.println("Пациент уже подписан.");
                    } else {
                        Patient patient = new Patient(patientName);
                        patients.put(patientName, patient);
                        medicalTest.subscribe(patient);
                    }
                    break;

                case "remove":
                    System.out.print("Введите имя пациента для удаления: ");
                    patientName = scanner.nextLine();
                    Patient patientToRemove = patients.get(patientName);
                    if (patientToRemove != null) {
                        medicalTest.unsubscribe(patientToRemove);
                        patients.remove(patientName);
                    } else {
                        System.out.println("Пациент с таким именем не найден.");
                    }
                    break;

                case "result":
                    System.out.print("Введите новый результат анализа: ");
                    String result = scanner.nextLine();
                    medicalTest.setTestResult(result);
                    break;

                default:
                    System.out.println("Неизвестная команда. Попробуйте снова.");
            }
        }

        scanner.close();
    }
}
