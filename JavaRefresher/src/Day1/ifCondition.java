package Day1;

public class ifCondition {
    public static void main(String[] args) {
        /*
        if(condition ==  true){
            block
        }
        else{ //executed when my condition is false
            block
        }

         */

        int a = 50;
        int b = 50;

        if (a < b){
            System.out.println("A is lesser");
        }
        else if(b > a){
            System.out.println("B is lesser");
        }
        else{
            System.out.println("A and B are equal");
        }
    }
}
