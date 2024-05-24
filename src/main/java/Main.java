import adapter.Computer;
import adapter.SdCard;
import adapter.SdCardUsbAdapter;
import factory.Coffee;
import factory.CoffeeFactory;
import factory.CoffeeType;
import proxy.DatabaseConnection;
import proxy.DatabaseConnectionProxy;
import singleton.Logger;

public class Main {
    public static void main(String[] args) {
        //Демонстрация синглтона
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        logger1.classLog(Main.class, "some info");
        System.out.println("Ссылаются ли две переменные логгеров на один объект? " + (logger1 == logger2));

        //Демонстрация фабричного метода
        Coffee americano = CoffeeFactory.getCoffee(CoffeeType.AMERICANO);
        Coffee espresso = CoffeeFactory.getCoffee(CoffeeType.ESPRESSO);
        System.out.println(americano);
        System.out.println(espresso);

        //Демонстрация адаптера
        Computer computer = new Computer();
        SdCard sdCard = new SdCard();
        SdCardUsbAdapter adapter = new SdCardUsbAdapter(sdCard);
        computer.getInfoFromUsbDevice(adapter);

        //Демонстрация прокси
        DatabaseConnectionProxy proxy = new DatabaseConnectionProxy(
                new DatabaseConnection(),
                "localhost", "5432"
        );
        proxy.connect("some-db");
    }
}
