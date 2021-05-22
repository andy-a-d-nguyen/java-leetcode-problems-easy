import java.util.ArrayList;
import java.util.List;

/*
    Given an integer n and an integer start.

    Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.

    Return the bitwise XOR of all elements of nums.

    Input: int n, int start
    Output: count
    Constraints: 1 <= n <= 1000
                 0 <= start <= 1000
                 n == nums.length
*/

public class XorOperation {
    public static int xorOperation(int n, int start) {
        int result = 0;
        List<Integer> array = new ArrayList(n);

        for (int i = 0; i < n; i++) {
            array.add(start + 2 * i);
        }

        for (Integer i : array) {
            result = result ^ i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(5, 0));
    }
}
