public class SingletonClass {

    int x = 10;
    int y = 20;

    private static SingletonClass instance = null;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

}
