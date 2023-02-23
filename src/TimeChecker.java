import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class TimeChecker {
    public static Formatter format = new Formatter();
    public static Calendar timeInfo = Calendar.getInstance();
    public static void checkerTime(){
        int h = timeInfo.get(Calendar.HOUR_OF_DAY);
        int m = timeInfo.get(Calendar.MINUTE);
        System.out.println(h+" "+m);

    }
}
