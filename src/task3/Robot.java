package task3;

public class Robot extends RemoteDevice {
    public Robot(DeviceControl deviceControl) {
        super(deviceControl);
    }

    @Override
    public void operate(String command) {
        deviceControl.connect();
        deviceControl.sendCommand(command);
        deviceControl.disconnect();
    }
}
