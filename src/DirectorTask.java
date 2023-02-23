import java.util.Random;

public class DirectorTask extends Task {


    public DirectorTask(String personal, String targetOfTask, int timeHour, int timeMinute, int priority) {
        super(personal, targetOfTask, timeHour, timeMinute, priority);
    }

    @Override
    public String getPerson() {
        return "Директор";
    }

}
