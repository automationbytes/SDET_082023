package Day5;
public class userexex {
    static void arrcheck(int[] arr) throws Exception {
        int len =  arr.length;

        if(len < 2){
            throw new Exception("Less Limit");
        } else if (len >= 10 && len<=15) {
            throw new Exception("Exceeds Limit");
        } else if (len >15 ) {
            throw new ArrayIndexOutOfBoundsException("Over Limit");

        }
    }

    public static void main(String[] args) throws Exception {
        int[] arr1 = {1,4,5,47,8789,4,4,7,3,5,10,454,1456};
        arrcheck(arr1);

    }
}
