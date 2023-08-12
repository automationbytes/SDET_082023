package Day3;

public class variables_eg {
    int a=5; //instance variable
    static int b = 50; // static variable
    void hello(){
        int a = 10; //local variable
        System.out.println(a); //10
    }

    public static void main(String[] args) {
        int a = 100;
        System.out.println(a);

        System.out.println(variables_eg.b);// access outside the class
        System.out.println(b); //within the class; classname is not required
    }
}
