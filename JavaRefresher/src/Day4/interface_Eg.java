package Day4;


interface mobile{
    void sms();
    void call();
}

interface camera{
    void photo();
}

class samsung implements mobile,camera{

    @Override
    public void sms() {
        System.out.println("Samsung sms");
    }

    @Override
    public void call() {
        System.out.println("Samsung call");
    }

    @Override
    public void photo() {
        System.out.println("Samsung camera");
    }
}

class Apple implements mobile{

    @Override
    public void sms() {
        System.out.println("Apple sms");
    }

    @Override
    public void call() {
        System.out.println("Apple call");
    }
}



public class interface_Eg {
    public static void main(String[] args) {
        samsung s = new samsung();
        s.call();
        s.sms();
        s.photo();
    }

}
