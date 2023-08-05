package Day1;

public class LogicalOperator
{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 15;

        System.out.println(a<b && a<c);

        /*
        && - AND
        true and true = true
        true and false = false
        false and false = false
        false and true = false
         */

        System.out.println(a<b || a<c);
        /*
        || - OR
        true or true = true
        true or false = true
        false or false = false
        false or true = true
         */

        //not
        /*
        ! - Not
        true -> false
        false -> true

         */

        System.out.println(!(a == b));
    }
}
