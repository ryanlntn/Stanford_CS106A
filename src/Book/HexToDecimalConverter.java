import acm.program.*;

/**
 * This program converts hexadecimal to decimal.
 */
public class HexToDecimalConverter extends ConsoleProgram {

    public void run() {
        println("This program converts hexadecimal to decimal.");
        println("Enter 0 to stop.");
        while (true) {
            String hex = readLine("Enter a hexadecimal number: ");
            if (Integer.parseInt(hex, 16) == 0) break;
            println(hex + " hex = " + Integer.parseInt(hex, 16) + " decimal");
        }
    }

}
