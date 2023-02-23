import java.util.Random;

public class StorageTask extends Task{

    public StorageTask(String type, int timeH, int timeM, int priority) {
        super(type, timeH, timeM, priority);
    }

    public String getStuf(){
        personal.add("Директор Джон");
        personal.add("Заведующий Константин");
        personal.add("Бухгалтер Екатерина");
        personal.add("Инженер Олег");
        personal.add("Механик Иван");
        personal.add("Бухгалтер Анастасия");
        Random random = new Random();
        return personal.get(random.nextInt(personal.size()));
    }
    @Override
    public String getPerson() {
        return "Служба склада";
    }
}
