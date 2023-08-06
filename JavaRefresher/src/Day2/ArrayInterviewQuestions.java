package Day2;

import java.util.Arrays;

public class ArrayInterviewQuestions {
    public static void main(String[] args) {
        int[] arr = {7,4,5,9,2,3,1,8,10};
//        int temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] > arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        //Ascending order

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //find the largest number
        //arr[arr.length-n]

        //find the smallest number
        //arr[n-1]
        //find the nth largest (2nd, 3rd)

        System.out.println(arr[arr.length-2]); //second largest
        //

        System.out.println(arr[1-1]); //1st smallest number

    }
}
