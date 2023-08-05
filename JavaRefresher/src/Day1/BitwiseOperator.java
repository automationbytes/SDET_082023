package Day1;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5; //   0101
        int b = 9; //   1001
                    //  0001 // convert back to number
        System.out.println(a & b); //xand

        /*
        1 and 1 = 1
        1 and 0 = 0
        0 and 1 = 0
        0 and 0 = 0
         */

        System.out.println(a | b); //xor

        //  0101
        //  1001
        //->1101
        /*
        1 or 1 = 1
        1 or 0 = 1
        0 or 1 = 1
        0 or 0 = 0

         */

    }
}
