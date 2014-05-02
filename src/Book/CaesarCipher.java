import acm.program.ConsoleProgram;

/**
 * This program encodes a message using a Caeser cipher.
 */
public class CaesarCipher extends ConsoleProgram {

    public void run() {
        println("This program encodes a message using a Caeser cipher.");
        while (true) {
            int shift = readInt("Enter the number of character positions to shift: ");
            if (shift == 0) break;
            String message = readLine("Enter a message: ");
            println("Encoded message: " + encodeString(message, shift));
        }
    }

    private String encodeString(String message, int shift) {
        String encodedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            // This should work but for some reason I keep getting ` when I shift a -1
            encodedMessage += (char)((message.charAt(i) + shift - (int)'a') % 26 + (int)'a');
        }
        return encodedMessage;
    }

}
