import acm.program.ConsoleProgram;

/**
 * This program returns the ordinal from of the given number.
 */
public class OrdinalNumbers extends ConsoleProgram {

    public void run() {
        while (true) {
            int number = readInt("Enter number: ");
            if (number == 0) break;
            println("The ordinal form of " + number + " is " + ordinalForm(number));
        }
    }

    private String ordinalForm(int number) {
        if (number == 11 || number == 12 || number == 13) {
            return number + "th";
        } else if (number % 10 == 1) {
            return number + "st";
        } else if (number % 10 == 2) {
            return number + "nd";
        } else if (number % 10 == 3) {
            return number + "rd";
        } else {
            return number + "th";
        }
    }

}
