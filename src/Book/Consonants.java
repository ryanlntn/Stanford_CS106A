import acm.program.ConsoleProgram;

public class Consonants extends ConsoleProgram {

    public void run() {
        println("This program prints a list of all the consonants in the English language.");
        for (int i = 'a'; i < 'z'; i++) {
            if (isEnglishConsonant((char) i)) {
                println((char) i);
            }
        }
    }

    private boolean isEnglishConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return ch >= 'b' && ch <= 'z' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u';
    }

}
