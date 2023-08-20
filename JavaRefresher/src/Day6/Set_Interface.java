package Day6;
/*
Set will not allow duplicates

Hashset - random order (insertion order will not be preserved)

 */


import java.util.HashSet;

public class Set_Interface {
    public static void main(String[] args) {

        HashSet set = new HashSet();
        set.add(4);
        set.add(14);
        set.add(45);
        set.add(7);
        set.add(4);
        set.add(47);
        set.add(46);

        System.out.println(set);




    }
}
