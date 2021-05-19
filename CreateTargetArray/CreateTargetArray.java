import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Given two arrays of integers nums and index. Your task is to create target array under the following rules:

    Initially target array is empty.
    From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
    Repeat the previous step until there are no elements to read in nums and index.
    Return the target array.

    It is guaranteed that the insertion operations will be valid.

    Input: 2 arrays of integers
    Output: array of integers
    Constraints: 1 <= nums.length, index.length <= 100
                 nums.length == index.length
                 0 <= nums[i] <= 100
                 0 <= index[i] <= i
*/

public class CreateTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<Integer>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createTargetArray(new int[] {0, 1, 2, 3, 4}, new int[] {0, 1, 2, 2, 1})));
    }
}
