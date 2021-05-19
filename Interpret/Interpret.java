/*
    You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

    Given the string command, return the Goal Parser's interpretation of command.

    Input: string
    Output: string
    Constraints: 1 <= command.length <= 100
                 command consists of "G", "()", and/or "(al)" in some order.
*/

public class Interpret {
    public static String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
        // "\\(" => second forward slash escapes the opening parenthesis, first forward slash escapes the second forward slash
    }

    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
    }
}
