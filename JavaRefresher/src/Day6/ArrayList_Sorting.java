package Day6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(54);
        list.add(35);
        list.add(7);
        list.add(41);
        list.add(49);
//
//        //sort
//        Collections.sort(list);
//        System.out.println(list);
//
//        //reverse
//        Collections.reverse(list);
//        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


    }
}
