/*
    You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

    A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

    Input: m * n array of integers
    Output: integer
    Constraints: m == accounts.length
                 n == accounts[i].length
                 1 <= m, n <= 50
                 1 <= accounts[i][j] <= 100
    Edge cases: none
*/

class MaximumWealth {
    public static int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int personalWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                personalWealth += accounts[i][j];
            }
            if (personalWealth > maximumWealth) {
                maximumWealth = personalWealth;
            }
        }
        return maximumWealth;
    }

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
    }
}