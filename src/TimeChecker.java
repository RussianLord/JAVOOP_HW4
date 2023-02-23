import java.util.Calendar;

public class TimeChecker {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static Calendar timeInfo = Calendar.getInstance();
    public static void checkerTime(Task info){
        int h = timeInfo.get(Calendar.HOUR_OF_DAY);
        int m = timeInfo.get(Calendar.MINUTE);
        int hT = info.getTimeHour();
        int hDT = info.getDeadLineH();
        int mT = info.getTimeMinute();
        int mDt = info.getDeadLineM();
        if((h + hT > hDT)||(h + hT >= hDT && m + mT >= mDt)){
            System.out.println(h+"---"+info.getTimeHour()+"---"+info.getDeadLineH());
            System.out.println(ANSI_RED+"Задача просрочена!"+ANSI_RESET);
        } else if(h + hT == hDT && m + mT < mDt){
            System.out.println("У вас осталось "+(m + mT >= mDt)+"мин.");
        }
        else {
            System.out.println("У вас в запасе более часа!");
        }

    }
}
