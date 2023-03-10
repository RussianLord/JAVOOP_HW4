import java.util.Calendar;

public abstract class Task {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public final int id;
    private static int count;
    private int deadLineH;
    private int deadLineM;
    private String nameTask;
    private int priority;
    private int timeHour;
    private int timeMinute;
    private int startH;
    private int startM;
    static String typePerson;
    private String personal;
    Calendar getTimeNow = Calendar.getInstance();


    public Task(String personal, String targetOfTask, int timeHour, int timeMinute, int priority, int deadLineH, int deadLineM) {
        count++;
        this.id = getCount();
        this.startH = getTimeNow.get(Calendar.HOUR_OF_DAY);
        this.startM = getTimeNow.get(Calendar.MINUTE);
        this.typePerson = getPerson();
        this.personal = personal;
        this.nameTask = targetOfTask;
        this.timeHour = timeHour;
        this.timeMinute = timeMinute;
        this.priority = priority;
        this.deadLineH = deadLineH;
        this.deadLineM = deadLineM;
    }

    public String getNameTask() {
        return nameTask;
    }

    public int getTimeHour() {
        return timeHour;
    }

    public int getTimeMinute() {
        return timeMinute;
    }

    public static String getTypePerson() {
        return typePerson;
    }

    private int getCount() {
        return count;
    }


    public String getPerson() {
        return typePerson;
    }


    public String getTask() {
        return "ID задачи: " + id + " Старт задачи: " + startH+" ч. "+startM+" мин. Постановщик задачи: "
                + getPerson() + ". Ответственный: " + personal + ". Суть задачи: " + nameTask
                + ". Время выполнения задачи: " + timeHour + " ч. " + timeMinute + " мин. " + ". Приоритет задачи: "
                + getPriority() + ". Дедлайн: " + deadLineH + " ч. " + deadLineM + " мин.";
    }

    public String getPriority() {
        if (priority == 1) {
            return ANSI_GREEN + "Обычный" + ANSI_RESET;
        } else if (priority == 2) {
            return ANSI_YELLOW + "Повышенный" + ANSI_RESET;
        } else if (priority == 3) {
            return ANSI_RED + "Срочный" + ANSI_RESET;
        }
        return "Неизвестный";
    }

    public int getDeadLineH() {
        return deadLineH;
    }

    public int getDeadLineM() {
        return deadLineM;
    }
}
