package Day3;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numarr = {4,8,9,4,3,6,9,1,8};

        for (int i = 0; i < numarr.length; i++) {
            System.out.println(numarr[i]);
            for (int j = i+1; j < numarr.length; j++) {
                if(numarr[i] == numarr[j]){
                    System.out.println("Duplicate value: "+numarr[i]);
                }
            }
        }
    }
}
