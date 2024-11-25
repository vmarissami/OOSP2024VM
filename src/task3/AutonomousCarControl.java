package task3;

public class AutonomousCarControl implements DeviceControl {
    @Override
    public void connect() {
        System.out.println("Автономный автомобиль подключен.");
    }

    @Override
    public void sendCommand(String command) {
        System.out.println("Автономный автомобиль выполняет команду: " + command);
    }

    @Override
    public void disconnect() {
        System.out.println("Автономный автомобиль отключен.");
    }
}
