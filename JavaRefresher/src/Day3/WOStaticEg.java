package Day3;

public class WOStaticEg {
    int count = 0;////one memory for each object - totally 3

    WOStaticEg (){
        //    System.out.println("Constructor called");

        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        WOStaticEg s1 = new WOStaticEg();
        WOStaticEg s2 = new WOStaticEg();
        WOStaticEg s3 = new WOStaticEg();

    }
}
