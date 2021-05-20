import java.util.ArrayList;
import java.util.List;
/*
    You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

    The ith item is said to match the rule if one of the following is true:

    ruleKey == "type" and ruleValue == type[i].
    ruleKey == "color" and ruleValue == color[i].
    ruleKey == "name" and ruleValue == name[i].
    Return the number of items that match the given rule.

    Input: array of array of items, string key, string value
    Output: number of matches
    Constraints: 1 <= items.length <= 10^4
                 1 <= type[i].length, color[i].length, name[i].length, ruleValue.length <= 10
                 ruleKey is either "type", "color" or "name"
                 All strings consist of only lowercase letters
*/

public class CountMatches {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            switch (ruleKey) {
                case "type":
                    if (item.get(0).equals(ruleValue)) count++;
                    break;
                case "color":
                    if (item.get(1).equals(ruleValue)) count++;
                    break;
                default:
                    if (item.get(2).equals(ruleValue)) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        List<String> item1 = new ArrayList<>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");
        items.add(item1);

        List<String> item2 = new ArrayList<>();
        item2.add("computer");
        item2.add("silver");
        item2.add("lenovo");
        items.add(item2);

        List<String> item3 = new ArrayList<>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");
        items.add(item3);

        System.out.println(countMatches(items, "color", "silver"));
        System.out.println(countMatches(items, "type", "phone"));

    }
}

/*
    ALTERNATIVE SOLUTION:
    private static final Map<String, Integer> rule = Map.of("type", 0, "color", 1, "name", 2);
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0, index = rule.get(ruleKey);
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                ++cnt;
            }
        }
        return cnt;
    }
*/