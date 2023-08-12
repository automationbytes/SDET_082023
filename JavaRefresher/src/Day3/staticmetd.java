package Day3;

public class staticmetd {

    static String name = "Yellow Car";

    static void changename(){
        name = "Black Car";
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println(name); //Yellow Car
        changename(); //Black Car
        System.out.println(name);//Black Car
    }
}
