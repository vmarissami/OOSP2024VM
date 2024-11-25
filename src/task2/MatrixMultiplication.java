package task2;

public class MatrixMultiplication implements MatrixOperation {
    @Override
    public double[][] performOperation(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int commonDim = matrix1[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < commonDim; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    @Override
    public double performSingleMatrixOperation(double[][] matrix) {
        throw new UnsupportedOperationException("Умножение требует двух матриц.");
    }
}
