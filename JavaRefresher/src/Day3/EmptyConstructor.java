package Day3;

public class EmptyConstructor {

    String name;//null
    int age; //0

    void display(){
        System.out.println(this.name+"'s is age "+this.age);
    }

    public static void main(String[] args) {

        EmptyConstructor em = new EmptyConstructor();
        em.display();
        System.out.println(em.age);
        System.out.println(em.name);
    }
}
