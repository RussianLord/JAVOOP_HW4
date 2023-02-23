import java.util.Random;

public class StorageTask extends Task{


    public StorageTask(String personal, String targetOfTask, int timeHour, int timeMinute, int priority) {
        super(personal, targetOfTask, timeHour, timeMinute, priority);
    }

    @Override
    public String getPerson() {
        return "Служба склада";
    }
}
