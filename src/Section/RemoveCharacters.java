import acm.program.ConsoleProgram;

public class RemoveCharacters extends ConsoleProgram {

    public void run() {
        println(removeAllOccurrences("This is a test", 't'));
        println(removeAllOccurrences("Summer is here!", 'e'));
        println(removeAllOccurrences("---0---", '-'));
    }

    public String removeAllOccurrences(String str, char ch) {
        return str.replaceAll(Character.toString(ch), "");
    }

}
