import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;

public class Calendar {
    static List<String> listTaksk = new ArrayList<>();
    static void addCalendar(Task thisTask){
        listTaksk.add(thisTask.getTask());
    }

    public static List<String> getListTaksk() {
        return listTaksk;
    }

    public static void fileWriter(){
        try (FileWriter writer = new FileWriter("Calendar_Tasks.txt",false)){
            for (int i = 0; i < listTaksk.size(); i++) {
                writer.write(listTaksk.get(i)+"\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
