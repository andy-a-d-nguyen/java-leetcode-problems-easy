package LongestCommonPrefix;

/*
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".

    Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

    Input: array of strings
    Output: string
    Constraints: 1 <= strs.length <= 200
                 0 <= strs[i].length <= 200
                 strs[i] consists of only lowercase English letters
*/

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        // assume first word is common prefix
        String commonPrefix = strs[0];

        // iterate over remaining words
            // as long as current word does not contain common prefix
                // remove last letter from common prefix to find possible common prefix in loop
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(commonPrefix)) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
            }
        }

        return commonPrefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
