package Day4;

public class OOPS {

    String name;
    int age;

    public OOPS(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void toStudy(){
        System.out.println(this.name+" studying and age is "+this.age);
    }

    public static void main(String[] args) {
        OOPS o1 = new OOPS("abc",5);
        o1.toStudy();

        OOPS o2 = new OOPS("yuvi",5);
        o2.toStudy();

    }
}
