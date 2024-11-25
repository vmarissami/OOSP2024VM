package task9;

public class SharedResource {
    private int value = 0;

    public void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}
