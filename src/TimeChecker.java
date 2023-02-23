import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class TimeChecker {
    public static Formatter format = new Formatter();
    public static Calendar timeInfo = Calendar.getInstance();
    static void checkerTime(Task info){
        int h = timeInfo.get(Calendar.HOUR_OF_DAY);
        int m = timeInfo.get(Calendar.MINUTE);
        int hT = info.getTimeHour();
        int hDT = info.getDeadLineH();
        int mT = info.getTimeMinute();
        if(h + hT > hDT){
            System.out.println(h+"---"+info.getTimeHour()+"---"+info.getDeadLineH());
            System.out.println("Пизда рулю");
        } else {
            System.out.println(h+"---"+info.getTimeHour()+"---"+info.getDeadLineH());
        }

    }
}
