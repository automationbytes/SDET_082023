package Day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_Eg {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM:dd:yyyy");
        System.out.println(date.format(formatter));

        LocalDateTime futureDate = date.plusDays(5);
        System.out.println(futureDate.format(formatter));


        LocalDateTime previousDate = date.minusDays(5);
        System.out.println(previousDate.format(formatter));



    }
}
