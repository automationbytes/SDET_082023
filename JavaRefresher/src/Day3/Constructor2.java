package Day3;

public class Constructor2 {
    String name;
    int age;

    Constructor2(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(this.name+"'s is age "+this.age);
    }

    public static void main(String[] args) {
        Constructor2 c = new Constructor2("Mahath",4);
        c.display();

        Constructor2 c2 = new Constructor2("Mahi",6);
        c2.display();

        Constructor2 c3 = new Constructor2("Ram",5);
        c3.display();


        Constructor2 c4 = new Constructor2("Siya",5);
        c4.display();
    }
}
