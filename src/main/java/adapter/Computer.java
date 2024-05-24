package adapter;

public class Computer {
    public void getInfoFromUsbDevice(UsbConnectable device) {
        device.connect();
    }
}
