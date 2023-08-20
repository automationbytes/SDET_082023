package Day6;

import java.util.ArrayList;
import java.util.Collections;

/*
List can be index based
List are ordered
List allow duplicates

List can be modifiable/growable
List can store homo/hetro data
List can store null values

Arraylist
---------
Default initial capacity is 10

New capacity formula- currrent capacity* 3/2 +1

10 -? 10*3/2 + 1 = 30/2 +1 =16
11 - 16*3/2+1 24+1 = 25
17

 */
public class ListInterface {

    public static void main(String[] args) {
        ArrayList al = new ArrayList(2); //2 -> 2*3/2 +1 -> 4

        al.add(1); //0
        al.add(5); //1
        al.add("Hello"); //2
        al.add(3.14); //3
        al.add(5); //4

        System.out.println(al);

        //add in specific position
        al.add(2,"Hi");
        System.out.println(al);

        //addAll - used to add from multiple array/list

        //clone - used to replicate the same values to newone

        ArrayList al1 = (ArrayList) al.clone();
        System.out.println(al1);

        //size - length of the arraylist
        System.out.println(al.size());

        //remove - based on value

        al1.remove("Hi");
        System.out.println(al1);

        //remove - based on index
        al1.remove(2);
        System.out.println(al1);

        //clear
        al1.clear();
        System.out.println(al1); //empty

        //contains
        System.out.println(al.contains(3.14));

        //indexof
        System.out.println(al);
        System.out.println(al.indexOf(3.14)); //4

        //get
        System.out.println(al.get(4)); //3.14

        //set - updating the value
        al.set(2,"Good");
        System.out.println(al);




    }
}
