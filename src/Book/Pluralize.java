import acm.program.ConsoleProgram;

/**
 * Write a method regularPluralForm(word) that returns the plural of word formed by following these standard English rules:
 *  a. If the word ends in s, x, z, ch, or sh, add es to the word.
 *  b. If the word ends in y and the y is preceded by a consonant, change the y to ies.
 *  c. In all other cases, add just an s.
 * Write a test program and design a set of test cases to verify that your program works.
 */
public class Pluralize extends ConsoleProgram {

    public void run() {
        while (true) {
            String word = readLine("Enter singular word: ");
            if (word.length() == 0) break;
            println("The plural form is " + regularPluralForm(word));
        }
    }

    private String regularPluralForm(String word) {
        String lastLetter = word.substring(word.length() - 1).toLowerCase();
        String lastTwoLetters = word.substring(word.length() - 2).toLowerCase();
        if (lastLetter.equals("s") || lastLetter.equals("x") || lastLetter.equals("z") || lastTwoLetters.equals("ch") || lastTwoLetters.equals("sh")) {
            return word + "es";
        } else if (lastLetter.equals("y") && !isVowel(word.charAt(word.length() - 2))) {
            return word.substring(0, word.length() - 1) + "ies";
        } else {
            return word + "s";
        }
    }

    private boolean isVowel(char chr) {
        return chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u';
    }

}
