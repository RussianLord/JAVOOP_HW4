import java.util.Random;

public class EngineerTask extends Task {


    public EngineerTask(String personal, String targetOfTask, int timeHour, int timeMinute, int priority) {
        super(personal, targetOfTask, timeHour, timeMinute, priority);
    }

    @Override
    public String getPerson() {
        return "Инженерная служба";
    }
}
