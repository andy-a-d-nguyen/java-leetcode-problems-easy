/*
    Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

    Given a balanced string s, split it in the maximum amount of balanced strings.

    Return the maximum amount of split balanced strings.

    Input: string
    Output: count
    Constraints: 1 <= s.length <= 1000
                 s[i] is either 'L' or 'R'
                 s is a balanced string
*/

public class BalancedStringSplit {
    public static int balancedStringSplit(String s) {
        int count = 0;
        int sameLetterStreak = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') sameLetterStreak++;
            else sameLetterStreak--;
            if (sameLetterStreak == 0) count++; // when streak is 0, we know there is an equal number of 'L' and 'R'
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }
}