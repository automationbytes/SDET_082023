package Day3;

public class Constructr {
    String name = "Mahi";
    int age = 6;

    void display(){
        System.out.println(this.name+"'s is age "+this.age);
    }

    public static void main(String[] args) {
        Constructr c = new Constructr();
        c.display();
    }
}
