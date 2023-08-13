package Day4;
//parent
class Animal{

    void eat(){
        System.out.println("Animal's Eat method");
    }

    void sleep(){
        System.out.println("Animal's Sleep Method");
    }
}
//child
class Dog extends Animal{
    void sound(){
        System.out.println("Dog's sound");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.sound();

        Animal a = new Animal();
        a.sleep();
        a.eat();

    }
}
