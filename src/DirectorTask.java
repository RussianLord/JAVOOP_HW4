import java.util.Random;

public class DirectorTask extends Task {


    public DirectorTask(String type, int timeH, int timeM, int priority) {
        super(type, timeH, timeM, priority);
    }

    public String getStuf(){
        personal.add("Бухгалтер Екатерина");
        personal.add("Инженер Олег");
        personal.add("Механик Иван");
        personal.add("Бухгалтер Анастасия");
        personal.add("Сотрудник склада Мария");
        personal.add("Сотрудник склада Алексей");
        Random random = new Random();
        return personal.get(random.nextInt(personal.size()));
    }

    @Override
    public String getPerson() {
        return "Директор";
    }

}
