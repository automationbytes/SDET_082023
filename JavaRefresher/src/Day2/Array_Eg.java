package Day2;

import java.util.Arrays;

/*

Array refers to data structure
One variable wil be storing multiple values
Array can be stored wit same datatype
Array are fixed in size
Array can contains duplicate values
Array can be accessed with index


 */
public class Array_Eg {
    public static void main(String[] args) {

        int[] arr = new int[5]; // preferred way
        //int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 9;
     //   arr[5] = 10;
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {5,4,2,3,9};
        System.out.println(Arrays.toString(arr1));

        //for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("***");
        //for each loop
        for(int a : arr){
            System.out.println(a);
        }

        String[] fruits = {"Apple","Mango","Banana","Grapes"};
        for (String f : fruits){
            System.out.println(f);
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
