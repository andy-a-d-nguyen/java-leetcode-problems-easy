
import java.util.ArrayList;
/*
    Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.

    For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.

    Input: array of integers
           integer
    Output: List of boolean
    Constraints: 2 <= candies.length <= 100
                 1 <= candies[i] <= 100
                 1 <= extraCandies <= 50
    Edge cases: none
*/
import java.util.List;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // create a result list
        java.util.List<Boolean> canHaveMaxCandies = new ArrayList<>(candies.length);

        // store biggest number of candies
        int maxNumOfCandies = 0;

        // iterate over array of candies to find maxNumOfCandies
        for (int candy : candies) {
            maxNumOfCandies = Math.max(maxNumOfCandies, candy);
        }

        // iterate over array of candies to determine canHaveMaxCandies
        for (int candy : candies) {
            canHaveMaxCandies.add(candy + extraCandies >= maxNumOfCandies);
        }

        return canHaveMaxCandies;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] {2,3,5,1,3}, 3));
    }
}
