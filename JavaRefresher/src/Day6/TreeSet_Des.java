package Day6;

import java.util.TreeSet;

public class TreeSet_Des {
    public static void main(String[] args) {
        TreeSet set = (TreeSet) new TreeSet<>().descendingSet();
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
