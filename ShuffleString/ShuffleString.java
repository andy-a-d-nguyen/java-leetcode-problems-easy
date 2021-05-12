/*
    Given a string s and an integer array indices of the same length.

    The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

    Return the shuffled string.

    Input: string, array of indices
    Output: string
    Constraints: s.length == indices.length == n
                 1 <= n <= 100
                 s contains only lowercase English letters
                 0 <= indices[i] <= n
                 All value of indices are unique
*/

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        StringBuilder strBuilder = new StringBuilder();

        int i = 0;

        while (i < indices.length) {
            int j = 0;
            while (indices[j] != i) {
                j++;
            }
            strBuilder.append(s.charAt(j));
            i++;
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 1, 2, 3}));
    }
}

/*
    ALTERNATIVE SOLUTION:
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < indices.length; i++) arr[indices[i]] = s.charAt(i); // assign s[i] to arr at indices[i], which indicates correct position of s[i]
        return String.valueOf(arr);
    }
*/