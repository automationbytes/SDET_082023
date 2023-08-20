package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array2Arraylist {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Banana","Grapes","Orange","PineApple","Stawberry"};

        //method1 - not a suggested way (not recommended)

        List<String> list1 = Arrays.asList(fruits);
        System.out.println(list1);

       // System.out.println(list1.get(2));

        //method 2
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,fruits);
        System.out.println(list2);
        list2.add("Mango");
        System.out.println(list2);

        //method 3
        List<String> list3 = new ArrayList<>();
        for (String f : fruits){
            list3.add(f);
        }
        System.out.println(list3);

    }
}
