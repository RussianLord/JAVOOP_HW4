import java.util.Random;

public class OfficeTask extends Task{

    public OfficeTask(String type, int timeH, int timeM, int priority) {
        super(type, timeH, timeM, priority);
    }

    public String getStuf(){
        personal.add("Директор Джон");
        personal.add("Заведующий Константин");
        personal.add("Инженер Олег");
        personal.add("Механик Иван");
        personal.add("Сотрудник склада Мария");
        personal.add("Сотрудник склада Алексей");
        Random random = new Random();
        return personal.get(random.nextInt(personal.size()));
    }
    @Override
    public String getPerson() {
        return "Бухгалтерия";
    }

}
