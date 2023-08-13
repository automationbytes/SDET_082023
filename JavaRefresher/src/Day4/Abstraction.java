package Day4;


abstract class animal{
    abstract void sound(); //abstract methods

    //non abstract methods
    void sleep(){
        System.out.println("Sleep");
    }
}

class lion extends animal{

    @Override
    void sound() {
        System.out.println("Grrrrr");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        lion l = new lion();
        l.sound();
        l.sleep();

    }

}
