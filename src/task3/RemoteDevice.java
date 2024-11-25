package task3;

public abstract class RemoteDevice {
    protected DeviceControl deviceControl;

    protected RemoteDevice(DeviceControl deviceControl) {
        this.deviceControl = deviceControl;
    }

    public abstract void operate(String command);
}
