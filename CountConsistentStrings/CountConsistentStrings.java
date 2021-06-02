/*
    You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

    Return the number of consistent strings in the array words.

    Input: string, array of strings
    Output: number of consistent strings
    Constraints: 1 <= words.length <= 10^4
                 1 <= allowed.length <= 26
                 1 <= words[i].length <= 10
                 The characters in allowed are distinct.
                 words[i] and allowed contain only lowercase English letters.
    Edge cases: none
*/

public class CountConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (String word : words) {
            boolean isConsistent = true;

            for (char letter : word.toCharArray()) {
                if (!allowed.contains(String.valueOf(letter))) isConsistent = false;
            }

            if (isConsistent) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[] {"ad","bd","aaab","baa","badab"}));
        System.out.println(countConsistentStrings("abc", new String[] {"a","b","c","ab","ac","bc","abc"}));

    }
}
