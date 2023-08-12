package Day3;

public class Methds2 {


    int sum(int a, int b){
        return a+b;
    }

    String greeting(String name){
        String output = "Hello "+name;
        return output;
    }
    public static void main(String[] args) {

        //object
        Methds2 obj = new Methds2();
        //Methds2 - classname
        //obj - object
        //Methds2() - constructor

        System.out.println(obj.greeting("Mahi"));

    }
}
