import acm.program.ConsoleProgram;

/**
 * This program returns the present participle for a given verb.
 */
public class PresentParticiple extends ConsoleProgram {

    private static final String SUFFIX = "ing";

    public void run() {
        while (true) {
            String verb = readLine("Enter verb: ");
            if (verb.length() == 0) break;
            println("The present participle of " + verb + " is " + presentParticiple(verb));
        }
    }

    private String presentParticiple(String verb) {
        String lastTwoLetters = verb.substring(verb.length() - 2);
        if (lastTwoLetters.charAt(1) == 'e' && !isVowel(lastTwoLetters.charAt(0))) {
            return verb.substring(0, verb.length() - 1) + SUFFIX;
        } else if (!isVowel(lastTwoLetters.charAt(1)) && isVowel(lastTwoLetters.charAt(0))) {
            return verb + lastTwoLetters.substring(1) + SUFFIX;
        } else {
            return verb + SUFFIX;
        }
    }

    private boolean isVowel(char chr) {
        return chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u';
    }

}
