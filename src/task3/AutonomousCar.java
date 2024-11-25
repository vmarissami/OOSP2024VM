package task3;

public class AutonomousCar extends RemoteDevice {
    public AutonomousCar(DeviceControl deviceControl) {
        super(deviceControl);
    }

    @Override
    public void operate(String command) {
        deviceControl.connect();
        deviceControl.sendCommand(command);
        deviceControl.disconnect();
    }
}
