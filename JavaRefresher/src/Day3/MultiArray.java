package Day3;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][] num = {{1,2,3,7,8}, {4,5,6}};
                        // num[0] - 5
                        //num[1] - 3
        //length of array
        System.out.println(num.length);

     //   System.out.println(num[0][4]);
    // normal for loop
        for (int i = 0; i < num.length; i++) {
            System.out.println("num.length   " + num.length);
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("num[i].length  "+num[i].length);
                System.out.print(num[i][j]+"  ");
            }
            System.out.println();
        }


//{{1,2,3,7,8}, {4,5,6}};
     //   0          1
        // extended for (for each)
        for(int[] rows : num){
           // System.out.println(Arrays.toString(rows));
            for (int value : rows){
                System.out.print(value+ "  ");
            }
            System.out.println();
        }

        int[] arr = {1,2,3,4,5};
        for(int a : arr){
            System.out.println(a);
        }


        String[] names = {"Apple", "Banana", "Grapes"};
        for (String i : names){
            System.out.println(i);
        }

        int[] numarr = {4,8,9,4,3,6};
        for(int n : numarr){
            System.out.println(n);
        }

        double[] darr = {4.5,4.1,6.,7.1,169.55};
        for(double d : darr){
            System.out.println(d);
        }

        //for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }



        //for(datatype a : arr/collections)
    }

}
