package Day5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormat_Eg {
    public static void main(String[] args) {
        String pattern = "MM-dd-yyyy";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();

        calendar.add(Calendar.DAY_OF_YEAR,5);
        Date futureDate = calendar.getTime();
        System.out.println(simpleDateFormat.format(futureDate));


        calendar.add(Calendar.DAY_OF_YEAR,-5);
        Date previday = calendar.getTime();
        System.out.println(simpleDateFormat.format(previday));


    }
}
