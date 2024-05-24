package adapter;

public class SdCardUsbAdapter implements UsbConnectable {
    private final SdCard sdCard;

    public SdCardUsbAdapter(SdCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public void connect() {
        System.out.println("Устройство подключено через адаптер. Содержимое карты: " + sdCard.getContainedInfo());
    }
}
