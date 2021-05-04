import java.util.Arrays;

/*
    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

    Return the array in the form [x1,y1,x2,y2,...,xn,yn].

    Input: an array of integers
           a num
    Output: an array of integers
    Constraints: 1 <=n <=500
    nums.length == 2n
    1 <= nums[i] <= 10^3

     1  2  3  1  2  3
    [2, 5, 1, 3, 4, 7]

     1  1  2  2  3  3
    [2, 3, 5, 4, 1, 7]
*/

public class Shuffle {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{1,2,3,4,4,3,2,1}, 4)));
    }
}
