import acm.program.ConsoleProgram;

public class Capitalize extends ConsoleProgram {

    public void run() {
        println(capitalize("BOOLEAN"));
        println(capitalize("STRING"));
        println(capitalize("character"));
        println(capitalize("oBjEcT"));
        println(capitalize("intEger"));
    }

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length()).toLowerCase();
    }

}
