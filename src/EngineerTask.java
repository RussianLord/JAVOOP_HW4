import java.util.Random;

public class EngineerTask extends Task {


    public EngineerTask(String type, int timeH, int timeM, int priority) {
        super(type, timeH, timeM, priority);
    }

    public String getStuf() {
        personal.add("Директор Джон");
        personal.add("Заведующий Константин");
        personal.add("Бухгалтер Екатерина");
        personal.add("Бухгалтер Анастасия");
        personal.add("Сотрудник склада Мария");
        personal.add("Сотрудник склада Алексей");
        Random random = new Random();
        return personal.get(random.nextInt(personal.size()));
    }

    @Override
    public String getPerson() {
        return "Инженерная служба";
    }
}
