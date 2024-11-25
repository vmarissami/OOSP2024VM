package task3;

public interface DeviceControl {
    void connect();
    void sendCommand(String command);
    void disconnect();
}
