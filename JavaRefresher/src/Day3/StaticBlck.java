package Day3;

public class StaticBlck {

    static int a = 10;
    static {
        System.out.println("Static Block is called");
    }

    public static void main(String[] args) {
        System.out.println("Main Method is called");
    }
}
