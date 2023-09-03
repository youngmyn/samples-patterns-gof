package creational.singleton;

public class SynchronizedSingleton {
    private static volatile SynchronizedSingleton INSTANCE;

    private SynchronizedSingleton() {}

    public static SynchronizedSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (SynchronizedSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SynchronizedSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
