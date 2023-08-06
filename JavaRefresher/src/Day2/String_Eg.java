package Day2;

import java.lang.reflect.Array;
import java.util.Arrays;

/*

String - used to store more than one char
surrounded with ""

Literal way - String pool memory
New Keyword way - Heap memory

 */
public class String_Eg {
    public static void main(String[] args) {

        //literal way
        String a = "Hello";
        String b = "Hello";

        //new Keyword way
        String c = new String("Hello");
        String d = new String("Hello");

        // == check value and also memory

        System.out.println(a == b);

        System.out.println(a == c);

        System.out.println(c == d);

        //equal
        System.out.println(c.equals(d));

        String e = "HELLO";
        System.out.println(c.equalsIgnoreCase(e));

        //compareTo
        String f = "abcd"; //97 98 99 100
        String g = "abGh"; //97 98 71 104
        System.out.println(f.compareTo(g));

        System.out.println(f.compareToIgnoreCase(g));

        System.out.println(g.length());

        //starts-with
        String h = "Hello World";
        System.out.println(h.startsWith("He"));
        //ends-with
        System.out.println(h.endsWith("ld"));
        //contains
        System.out.println(h.contains("Wo"));

        //indexof //H-0 e-1 l-2 l-3 o-4 -5 W-6 o-7
        System.out.println(h.indexOf("o"));


        //charAt
        System.out.println(h.charAt(4));

        //concat - addng 2 string
        String i = "Ice";
        String j = "Cream";
        System.out.println(i.concat(j));
        System.out.println(i+j);

        System.out.println(i.replace("I","Fa"));

        //split
        String k = "Kalpana is a beautiful girl";
        String[] arr = k.split(" ");
        System.out.println(Arrays.toString(arr));

        String l = "    Love   you   ";
        System.out.println(l.trim());
        System.out.println(l.strip());
        System.out.println(l.stripLeading());
        System.out.println(l.stripTrailing());

        System.out.println(l.toUpperCase());
        System.out.println(l.toLowerCase());

        String m = "Monkey";
        System.out.println(m.substring(0,4));

        char[] carr = m.toCharArray();
        System.out.println(Arrays.toString(carr));

    }
}
