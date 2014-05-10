import acm.program.ConsoleProgram;
import java.util.*;

/**
 * This program collects a list of unique names to print to the screen.
 */
public class UniqueNames extends ConsoleProgram {

    private ArrayList<String> names = new ArrayList<String>();

    public void run() {
        while (true) {
            String n = readLine("Enter name: ");
            if (n.equals("")) break;
            if (isUnique(n)) names.add(n);
        }
        println("Unique name list contains: ");
        for (int i = 0; i < names.size(); i++) {
            println(names.get(i));
        }
    }

    private boolean isUnique(String name) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(name)) return false;
        }
        return true;
    }

}
