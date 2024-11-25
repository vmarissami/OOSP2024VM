package task2;

public class MatrixAddition implements MatrixOperation {
    @Override
    public double[][] performOperation(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    @Override
    public double performSingleMatrixOperation(double[][] matrix) {
        throw new UnsupportedOperationException("Сложение требует двух матриц.");
    }
}
