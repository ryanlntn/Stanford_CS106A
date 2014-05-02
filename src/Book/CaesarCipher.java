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
            char chr = (char)(message.charAt(i) + shift);
            if (chr > 'z') {
                encodedMessage += (char)(message.charAt(i) - (26 - shift));
            } else if (chr < 'a') {
                encodedMessage += (char)(message.charAt(i) + (26 + shift));
            } else {
                encodedMessage += (char)(message.charAt(i) + shift);
            }
        }
        return encodedMessage;
    }

}
