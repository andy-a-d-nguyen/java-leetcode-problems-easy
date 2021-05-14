import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
/*
    We are given a list nums of integers representing a list compressed with run-length encoding.

    Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

    Return the decompressed list.

    Input: array of integers
    Output: array of integers
    Constraints: 2 <= nums.length <= 100
                 nums.length % 2 == 0
                 1 <= nums[i] <= 100
*/

public class DecompressRLEList {
    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                result.add(nums[i + 1]);
            }
        }
        return result.stream().filter(Objects::nonNull).mapToInt(index -> index).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decompressRLElist(new int[]{1, 2, 3, 4})));
    }
}

/*
    ALTERNATIVE SOLUTION:
    class Solution {
        public int[] decompressRLElist(int[] nums) {
            int arrSize = 0;
            for (int i = 0; i < nums.length; i += 2) {
                arrSize += nums[i];
            }

            int[] result = new int[arrSize];

            int startIdx = 0;
            for (int i = 0; i < nums.length; i += 2) {
                Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
                startIdx += nums[i];
            }
            return result;
        }
    }
*/
