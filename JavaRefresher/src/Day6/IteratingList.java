package Day6;

import java.util.*;

public class IteratingList {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Banana","Grapes","Orange","PineApple","Stawberry"};
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,fruits);
        System.out.println(list2);

        for(Object l : list2){
            System.out.println(l);
            if(l.equals("Orange")){
            //    list2.remove(l);
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i).equals("Orange")){
                list2.remove(i);
            }
            //System.out.println(list2.get(i));

        }

        //iterator

        ListIterator<String> listIterator = list2.listIterator();
        while (listIterator.hasNext()){
            if(listIterator.next().equals("Orange")){
                listIterator.remove();
            }
          //  System.out.println(listIterator.next());
        }

        System.out.println(list2);

        list2.removeIf(el -> el.equals("Stawberry"));
        System.out.println(list2);







    }
}
