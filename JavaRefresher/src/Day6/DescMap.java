package Day6;

import java.util.NavigableMap;
import java.util.TreeMap;

public class DescMap {
    public static void main(String[] args) {
        NavigableMap<Object, Object> map = new TreeMap<>().descendingMap();

        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);

        System.out.println(map);
    }
}
