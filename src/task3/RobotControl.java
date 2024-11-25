package task3;

public class RobotControl implements DeviceControl {
    @Override
    public void connect() {
        System.out.println("Робот подключен.");
    }

    @Override
    public void sendCommand(String command) {
        System.out.println("Робот выполняет команду: " + command);
    }

    @Override
    public void disconnect() {
        System.out.println("Робот отключен.");
    }
}
