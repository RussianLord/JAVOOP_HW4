import java.util.Random;

public class OfficeTask extends Task{


    public OfficeTask(String personal, String targetOfTask, int timeHour, int timeMinute, int priority) {
        super(personal, targetOfTask, timeHour, timeMinute, priority);
    }

    @Override
    public String getPerson() {
        return "Бухгалтерия";
    }

}
