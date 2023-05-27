package hackerrank.easy;

public class JavaSingletonPattern {

}

class Singleton {

    private static Singleton singleInstance;
    public String str;

    private Singleton() {
        str = "Hello I am a singleton!";
    }

    public static Singleton getSingleInstance() {
        if (singleInstance == null) singleInstance = new Singleton();
        return singleInstance;
    }
}
