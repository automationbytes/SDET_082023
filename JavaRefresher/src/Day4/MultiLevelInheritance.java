package Day4;


//parent
class AAnimal{

    void eat(){
        System.out.println("Animal's Eat method");
    }

    void sleep(){
        System.out.println("Animal's Sleep Method");
    }
}
//child
class DDog extends AAnimal{
    void sound(){
        System.out.println("Dog's sound");
    }
}

class BullDog extends DDog{

    void play(){
        System.out.println("BullDog's Play method");
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args) {

        BullDog b = new BullDog();
        b.play();
    }
}
