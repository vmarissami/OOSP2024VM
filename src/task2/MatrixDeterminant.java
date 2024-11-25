package task2;

public class MatrixDeterminant implements MatrixOperation {
    @Override
    public double[][] performOperation(double[][] matrix1, double[][] matrix2) {
        throw new UnsupportedOperationException("Определитель работает только с одной матрицей.");
    }

    @Override
    public double performSingleMatrixOperation(double[][] matrix) {
        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Матрица должна быть квадратной для вычисления определителя.");
        }
        return calculateDeterminant(matrix);
    }

    private double calculateDeterminant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        double determinant = 0;
        for (int i = 0; i < n; i++) {
            determinant += Math.pow(-1, i) * matrix[0][i] * calculateDeterminant(getMinor(matrix, i));
        }
        return determinant;
    }

    private double[][] getMinor(double[][] matrix, int column) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        for (int i = 1; i < n; i++) {
            int colIndex = 0;
            for (int j = 0; j < n; j++) {
                if (j == column) continue;
                minor[i - 1][colIndex++] = matrix[i][j];
            }
        }
        return minor;
    }
}
