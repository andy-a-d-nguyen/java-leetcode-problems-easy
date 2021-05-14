/*
    Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

    Input: positive integer
    Output: integer
    Constraints: 0 <= num <= 10^6
    Edge cases: none
*/

public class NumberOfSteps {
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
}

/*
    ALTERNATIVE SOLUTION:
    public int numberOfSteps (int num) {
        if (num == 0) return 0;
        int result = 0;

        while (num != 0) {
            // In order to count steps when right shifting one digit
            // For odd: we will subtract and divide by 2, which takes 2 steps
            // For even: we just divide by 2, which takes 1 step
            result += ((num & 1) == 0 ? 1 : 2);
            num >>= 1;
        }
        // We subtract 1 from result because when we the get to the most significant 1,
        // we only need to subtract it and we no longer need to divide by 2, so
        // only 1 step needed instead of the 2 that we counted when using the above while loop
        return result - 1;
    }
*/