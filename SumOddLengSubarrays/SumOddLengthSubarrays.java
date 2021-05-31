/*
    Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

    A subarray is a contiguous subsequence of the array.

    Return the sum of all odd-length subarrays of arr.

    Input: array of integers
    Output: num
    Constraints: 1 <= arr.length <= 100
                 1 <= arr[i] <= 1000
    Edge cases: none
*/

public class SumOddLengthSubarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int totalSubArrFromBeginToCurr = i + 1;
            int totalSubArrFromCurrToEnd = arr.length - i;
            int totalSubArrs = totalSubArrFromBeginToCurr * totalSubArrFromCurrToEnd;
            int totalOddSubArrs = totalSubArrs / 2;

            // if totalSubArrs is odd, there is an odd sub array unaccounted for
            if (totalSubArrs % 2 == 1) {
                totalOddSubArrs++;
            }
            result += totalOddSubArrs * arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[] {1, 4, 2, 5, 3}));
    }
}

/*
    EXPLANATION:
    https://www.youtube.com/watch?v=J5IIH35EBVE
*/