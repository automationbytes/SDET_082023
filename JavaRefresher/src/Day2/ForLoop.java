package Day2;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
        }


        for (int i = 0; i < 100; i = i+10) {
            System.out.println("Hello " + i);
        }


        System.out.println("************");

        for(int i = 100; i>0;i--){
            System.out.println(i);
        }

    }
}
