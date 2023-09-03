package structural.proxy;


public interface DatabaseConnection {
    void commit();
    void close();
    String getClientInfo(String name);

}
