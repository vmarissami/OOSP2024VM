package task2;

public interface MatrixOperation {
    double[][] performOperation(double[][] matrix1, double[][] matrix2) throws UnsupportedOperationException;

    double performSingleMatrixOperation(double[][] matrix) throws UnsupportedOperationException;
}
