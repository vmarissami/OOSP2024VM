package task2;

public class MultiplicationFactory extends MatrixOperationFactory {
    @Override
    public MatrixOperation createOperation() {
        return new MatrixMultiplication();
    }
}
