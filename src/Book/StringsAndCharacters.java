import acm.program.ConsoleProgram;

public class StringsAndCharacters extends ConsoleProgram {

    public void run() {
        println("A is a consonant should be false: " + isEnglishConsonant('A'));
        println("B is a consonant should be true: " + isEnglishConsonant('B'));
    }

    private boolean isEnglishConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return ch >= 'b' && ch <= 'z' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u';
    }

}
