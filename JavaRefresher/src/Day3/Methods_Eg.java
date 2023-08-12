package Day3;

public class Methods_Eg {

    int a = 10;
    int b = 5;

    static int sum(int a, int b){
        return a+b;
    }

    static String greeting(String name){
        String output = "Hello "+name;
        return output;
    }

    static void dontwant(){
        System.out.println("Not willing to return");
    }

    public static void main(String[] args) {
        System.out.println(sum(10,5));

        System.out.println(greeting("Tom"));

        dontwant();
    }
}
