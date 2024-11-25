package task6;

import java.util.Scanner;

public class DataAnalysisApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataAnalyzer analyzer;

        System.out.println("Система анализа данных");
        System.out.println("Выберите метод анализа: ");
        System.out.println("1. Статистика");
        System.out.println("2. Машинное обучение");
        System.out.println("3. Генетические алгоритмы");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                analyzer = new StatisticalAnalysis();
                break;
            case 2:
                analyzer = new MachineLearningAnalysis();
                break;
            case 3:
                analyzer = new GeneticAlgorithmAnalysis();
                break;
            default:
                System.out.println("Некорректный выбор. Программа завершена.");
                return;
        }

        System.out.println("\nЗапуск анализа данных...\n");
        analyzer.analyzeData();

        System.out.println("\nАнализ завершен.");
        scanner.close();
    }
}
