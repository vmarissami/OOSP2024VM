package task2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в матричный калькулятор!");
        System.out.println("Доступные операции: сложение, умножение, определение определителя!");

        while (true) {
            System.out.print("\nВведите операцию (plus, multiply, determinant) или 'exit' для выхода: ");
            String operation = scanner.nextLine().toLowerCase();

            if (operation.equals("exit")) {
                System.out.println("Пока-пока! Жду тебя снова в своём калькуляторе!");
                break;
            }

            MatrixOperationFactory factory;
            switch (operation) {
                case "plus":
                    factory = new AdditionFactory();
                    break;
                case "multiply":
                    factory = new MultiplicationFactory();
                    break;
                case "determinant":
                    factory = new DeterminantFactory();
                    break;
                default:
                    System.out.println("Неверная операция.");
                    continue;
            }

            MatrixOperation matrixOperation = factory.createOperation();

            try {
                if (operation.equals("determinant")) {
                    double[][] matrix = inputMatrix(scanner, "Введите квадратную матрицу для вычисления определителя:");
                    System.out.println("Определитель: " + matrixOperation.performSingleMatrixOperation(matrix));
                } else {
                    double[][] matrix1 = inputMatrix(scanner, "Введите первую матрицу:");
                    double[][] matrix2 = inputMatrix(scanner, "Введите вторую матрицу:");
                    double[][] result = matrixOperation.performOperation(matrix1, matrix2);
                    System.out.println("Результат операции:");
                    printMatrix(result);
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static double[][] inputMatrix(Scanner scanner, String prompt) {
        System.out.println(prompt);
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];
        System.out.println("Введите элементы матрицы построчно по одному символу слева направо!");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.nextLine();
        return matrix;
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
