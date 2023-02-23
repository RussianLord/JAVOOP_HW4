import java.util.Random;

public class StorageTask extends Task{


    public StorageTask(String personal, String targetOfTask, int timeHour, int timeMinute, int priority, int deadLineH, int deadLineM) {
        super(personal, targetOfTask, timeHour, timeMinute, priority, deadLineH, deadLineM);
    }

    @Override
    public String getPerson() {
        return "Служба склада";
    }
}
