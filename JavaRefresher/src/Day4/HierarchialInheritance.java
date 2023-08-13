package Day4;

//parent
class aAnimal{

    void eat(){
        System.out.println("Animal's Eat method");
    }

    void sleep(){
        System.out.println("Animal's Sleep Method");
    }
}
//child
class dDog extends aAnimal {
    void sound(){
        System.out.println("Dog's sound");
    }
}

class cCat extends aAnimal{
    void catchRat(){
        System.out.println("Cats Method");
    }
}
public class HierarchialInheritance {
    public static void main(String[] args) {

    }
}
