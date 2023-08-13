package Day4;

public class OverLoading {

    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
    double sum(double a, double b){
        return a+b;
    }


    public static void main(String[] args) {
        OverLoading o = new OverLoading();
        o.sum(8.5,93.5);
        System.out.println(o.sum(3,5));
        System.out.println(o.sum(3,5,4));
    }
}
