package task3;

public class Drone extends RemoteDevice {
    public Drone(DeviceControl deviceControl) {
        super(deviceControl);
    }

    @Override
    public void operate(String command) {
        deviceControl.connect();
        deviceControl.sendCommand(command);
        deviceControl.disconnect();
    }
}
