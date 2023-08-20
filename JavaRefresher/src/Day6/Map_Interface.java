package Day6;

import java.util.HashMap;

public class Map_Interface {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);

        System.out.println(map);
        //containskey
        System.out.println(map.containsKey("Ten"));
        //contains value
        System.out.println(map.containsValue(4));

        map.replace("Four",400);
        System.out.println(map);

        map.remove("Five");
        System.out.println(map);

        System.out.println(map.get("Two"));


    }
}
