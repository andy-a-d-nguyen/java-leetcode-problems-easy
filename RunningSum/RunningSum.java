package RunningSum;
import java.util.Arrays;

/*
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

    Return the running sum of nums.


    Input: array nums
    Output: array nums
    Constraints: 1 <= nums.length <= 1000
                 -10^6 <= nums[i] <= 10^6
    Edge cases: none
*/

class RunningSum {
    public static int[] runningSum(int[] nums) {
        // create result array of same length as nums
        int[] runningSum = new int[nums.length];
        // create a sum variable
        int sum = 0;

        // iterate over nums
            // add nums[i] to sum
            // push sum to result array at index i
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }

        // return result array
        return runningSum;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3})));
    }

}