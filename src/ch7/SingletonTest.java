package ch7;

final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
        //...
    }

    public static Singleton getInstance() {
        if (s == null) {
            s= new Singleton();
        }
        return s;
    }

    //...
}

class SingletonTest {
    public static void main(String[] args) {
        // Singleton이 private해서 에러발생
//        Singleton s = new Singleton();
        Singleton s1 = Singleton.getInstance();
    }
}
