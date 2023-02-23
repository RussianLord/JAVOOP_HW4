import java.util.Random;

public class DirectorTask extends Task {


    public DirectorTask(String personal, String targetOfTask, int timeHour, int timeMinute, int priority, int deadLineH, int deadLineM) {
        super(personal, targetOfTask, timeHour, timeMinute, priority, deadLineH, deadLineM);
    }

    @Override
    public String getPerson() {
        return "Директор";
    }

}
