package proxy;

public class RealDatabaseConnection implements DatabaseConnection{
    @Override
    public void commit() {
        //some hard work
        System.out.println("Real DBC commit");
    }

    @Override
    public void close() {
        //some hard work
        System.out.println("Real DBC close");
    }

    @Override
    public String getClientInfo(String name) {
        //some hard work
        System.out.println("Real DBC getting client info");
        return name+" is a good person!";
    }
}
