package proxy;

public class DatabaseConnectionProxy implements PersistenceProvider {
    private final DatabaseConnection databaseConnection;
    private final String url;
    private final String port;

    public DatabaseConnectionProxy(DatabaseConnection databaseConnection, String url, String port) {
        this.databaseConnection = databaseConnection;
        this.url = url;
        this.port = port;
    }

    @Override
    public void connect(String dbName) {
        String fullUrl = url + ":" + port + "/" + dbName;
        databaseConnection.connect(fullUrl);
    }
}
