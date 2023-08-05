package Day1;

public class Datatypes_Eg {
    //main -> ctrl space
    public static void main(String[] args) {

        //not recommended datatypes
        byte b = (byte) 130; // 127 -128 -127 -126 -125 -124 ...
        //sout -> ctrl space | in eclipse sysout -> ctrl space
        System.out.println(b);
        //-32768 to 32767
        short s = 32767;
        System.out.println(s);

        //recommended

        int i = 5698985;
        System.out.println(i);

        long l = 89989989781L;
        System.out.println(l);

        //numbers with decimal points
        float f = 35.4893F;
        System.out.println(f);
        //false/true - in small letters
        boolean bool = true;
        System.out.println(bool);

        char c = 'f';
        System.out.println(c);

    }
}
