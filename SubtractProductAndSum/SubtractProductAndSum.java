/*
    Given an integer number n, return the difference between the product of its digits and the sum of its digits.

    Input: integer
    Output: integer
    Constraints: 1 <= n <= 10^5
    Edge cases: none
*/

public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        String numStr = Integer.toString(n);
        String[] nums = numStr.split("");
        int product = 1;
        int sum = 0;
        for (String num : nums) {
            product *= Integer.parseInt(num);
            sum += Integer.parseInt(num);
        }
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}

/*
    ALTERNATIVE SOLUTION (time: O(logn), space: O(1)):
    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n > 0) { 234 => 23 => 3
            sum += n % 10; // 234 % 10 = 4 => 23 % 10 = 3 => 3 % 10 = 3
            product *= n % 10;
            n /= 10; // 234 / 10 = 23 => 23 / 10 = 3 => 3 / 10 = 0
        }
        return product - sum;
    }
*/