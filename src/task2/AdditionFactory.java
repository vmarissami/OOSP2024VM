package task2;

public class AdditionFactory extends MatrixOperationFactory {
    @Override
    public MatrixOperation createOperation() {
        return new MatrixAddition();
    }
}
