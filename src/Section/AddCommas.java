import acm.program.ConsoleProgram;

/**
 * This program adds commas to numeric strings for display purposes.
 */
public class AddCommas extends ConsoleProgram {

    public void run() {
        while (true) {
            String digits = readLine("Enter a numeric string: ");
            if (digits.length() == 0) break;
            println(addCommasToNumericString(digits));
        }
    }


    private String addCommasToNumericString(String digits) {
        String digitsWithCommas = "";
        int digitCount = 0;
        for (int i = digits.length(); i > 0; i--) {
            if (digitCount == 3) {
                digitsWithCommas = "," + digitsWithCommas;
                digitCount = 1;
            } else {
                digitCount++;
            }
            digitsWithCommas = digits.substring(i - 1, i) + digitsWithCommas;
        }
        return digitsWithCommas;
    }

}
