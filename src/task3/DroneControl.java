package task3;

public class DroneControl implements DeviceControl {
    @Override
    public void connect() {
        System.out.println("Дрон подключен.");
    }

    @Override
    public void sendCommand(String command) {
        System.out.println("Дрон выполняет команду: " + command);
    }

    @Override
    public void disconnect() {
        System.out.println("Дрон отключен.");
    }
}
