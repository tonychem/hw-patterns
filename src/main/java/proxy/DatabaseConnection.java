package proxy;

public class DatabaseConnection implements PersistenceProvider {
    @Override
    public void connect(String url) {
        System.out.println("Подключено к бд по адресу " + url);
    }
}
