package Day3;

public class SumofArray {
    public static void main(String[] args) {
        int[] numarr = {4,8,9,4,3,6};
        int sum = 0;
        for (int i = 0; i < numarr.length; i++) {
            //System.out.println(numarr[i]);
            sum = sum+numarr[i];//0+4
                                //4+8
                                //12+9
        }
        System.out.println(sum);
        int add = 0;
        for (int n : numarr){
            add = add+n;
        }
        System.out.println(add);
    }
}
