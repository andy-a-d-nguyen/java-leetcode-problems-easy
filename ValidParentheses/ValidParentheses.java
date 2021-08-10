package ValidParentheses;

import java.util.Stack;

/*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

    Example 1:
    Input: s = "()"
    Output: true

    Example 2:
    Input: s = "()[]{}"
    Output: true

    Example 3:
    Input: s = "(]"
    Output: false

    Example 4:
    Input: s = "([)]"
    Output: false

    Example 5:
    Input: s = "{[]}"
    Output: true
*/

public class ValidParentheses {
    public static boolean isValid(String s) {

        // if string length is odd, string is invalid
        if (s.length() % 2 != 0) return false;

        // create an empty stack
        Stack<Character> stack = new Stack<>();

        // iterate through string
            // if a left parenthesis of a type is found, push the right parenthesis of that type onto the stack (store the number and order of right parenthesis we are expecting)
            // if nothing was pushed onto the stack, string is invalid (no opening parenthesis was found) or
            // if what was popped out of the stack does not match the current parenthesis, string is invalid (closing parenthesis was of different type or nonexistent or not in the location to constitute a valid closing parenthesis)
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        // to be valid string, stack must be empty at this point
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("([)]"));
    }
}
