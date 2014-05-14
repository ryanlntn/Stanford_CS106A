import acm.program.ConsoleProgram;
import java.util.*;

/**
 * This program collects a list of names and prints a count of how many times each is entered.
 */
public class CountNames extends ConsoleProgram {

    public void run() {
        while (true) {
            String name = readLine("Enter name: ");
            if (name.equals("")) break;
            countName(name);
        }
        displayNameCounts();
    }

    private void displayNameCounts() {
        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            println("Entry [" + entry.getKey() + "] has count " + entry.getValue());
        }
    }

    private void countName(String name) {
        Integer count = nameCounts.get(name);
        if (count != null) {
            nameCounts.put(name, count + 1);
        } else {
            nameCounts.put(name, 1);
        }
    }

    private Map<String, Integer> nameCounts = new HashMap<String, Integer>();

}
