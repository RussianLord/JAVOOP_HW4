import java.util.Random;

public class EngineerTask extends Task {


    public EngineerTask(String personal, String targetOfTask, int timeHour, int timeMinute, int priority, int deadLineH, int deadLineM) {
        super(personal, targetOfTask, timeHour, timeMinute, priority, deadLineH, deadLineM);
    }

    @Override
    public String getPerson() {
        return "Инженерная служба";
    }
}
