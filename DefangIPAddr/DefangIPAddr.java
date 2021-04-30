import java.util.Arrays;
import java.util.stream.Collectors;

/*
    Given a valid (IPv4) IP address, return a defanged version of that IP address.

    A defanged IP address replaces every period "." with "[.]".

    Input: String of IP address
    Output: String of IP address
    Constraints: address is valid IPv4 address
    Edge cases: none
*/

public class DefangIPAddr {
    public static String defangIPaddr(String address) {
        // split string into array on period
        /*
            .split() takes a regex parameter
            "." in regex means to match every character and therefore must be escaped to be used as a string literal
            "\." causes the "\" to not be escaped and therefore another "\" must be used to escape it
            "\\." escapes both the "\" and the "."
        */
        String[] parts = address.split("\\.");

        // join array with delimiter [.]
        String result = Arrays.stream(parts).collect(Collectors.joining("[.]"));

        return result;
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
