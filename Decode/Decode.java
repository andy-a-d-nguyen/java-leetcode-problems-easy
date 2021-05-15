import java.util.Arrays;

/*
    There is a hidden integer array arr that consists of n non-negative integers.

    It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

    You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].

    Return the original array arr. It can be proved that the answer exists and is unique.

    Input: array of integers, integer
    Output: array of integers
    Constraints:
*/

public class Decode {
    public static int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            result[i + 1] = result[i] ^ encoded[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decode(new int[]{1, 2, 3}, 1)));
    }
}
