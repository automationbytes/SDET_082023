package Day4;

class Google{

    void LoginPage(){
        System.out.println("Google Login Page");
    }

    void HomePage(){
        System.out.println("Google Home Page");
    }
}

class Youtube extends Google{
    void HomePage(){
        System.out.println("Youtube Home Page");
    }
}


public class ORiding {
    public static void main(String[] args) {
        Youtube y = new Youtube();
        y.HomePage();
        y.LoginPage();
    }
}
