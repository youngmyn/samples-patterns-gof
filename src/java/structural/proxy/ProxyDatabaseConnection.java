package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyDatabaseConnection implements DatabaseConnection{
    private RealDatabaseConnection realDatabaseConnection;
    private Map<String,String> clientInfo = new HashMap<>();

    public ProxyDatabaseConnection() {
        super();
    }

    @Override
    public void commit() {
        lazyInitRealDBC();
        realDatabaseConnection.commit();
    }

    @Override
    public void close() {
        lazyInitRealDBC();
        realDatabaseConnection.close();
    }

    @Override
    public String getClientInfo(String name) {
        lazyInitRealDBC();
        String info = clientInfo.get(name);
        if (info==null){
            info = realDatabaseConnection.getClientInfo(name);
            clientInfo.put(name, info);
        }
        return info;
    }
    private void lazyInitRealDBC(){
        if(realDatabaseConnection==null){
            realDatabaseConnection = new RealDatabaseConnection();
        }
    }
}
