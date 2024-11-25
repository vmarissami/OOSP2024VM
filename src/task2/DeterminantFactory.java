package task2;

public class DeterminantFactory extends MatrixOperationFactory {
    @Override
    public MatrixOperation createOperation() {
        return new MatrixDeterminant();
    }
}
