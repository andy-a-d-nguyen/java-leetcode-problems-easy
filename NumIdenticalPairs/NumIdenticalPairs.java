import java.util.HashMap;

/*
    Given an array of integers nums.

    A pair (i,j) is called good if nums[i] == nums[j] and i < j.

    Return the number of good pairs.

    Input: array of integers
    Output: integer
    Constraints: 1 <= nums.length <= 100
                 1 <= nums[i] <= 100
    Edge cases: none
*/

public class NumIdenticalPairs {
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int count = 0;
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                int occurrence = hashMap.get(num);
                count += occurrence;
                hashMap.put(num, occurrence + 1);
            } else {
                hashMap.put(num, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 3 }));
    }

}
