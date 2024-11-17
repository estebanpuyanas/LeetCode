import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * Example 1:
 * Input: s = "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: s = "(]"
 * Output: false
 */
class Solution {

  /**
   * Determines whether a string of parentheses is valid.
   * @param s the given parentheses.
   * @return true if valid, false otherwise.
   */
  public boolean isValid(String s) {
    /**
     * Stacks work like towers of pancakes: the last thing you put on, is the first thing that
     * will come out of the stack. this is helpful in this problem since we want to track the order
     * in which things (parenthesis) are being put on (opening) and removed (closed).
     */
    Stack<Character> result = new Stack<>();

    /**
     * Eeasy base case to check, if the string is not of even length then it cannot possibly return
     * true as at least one parenthesis would be missing its closing equivalent.
     */
    //first base case: the string is not of even length
    if (s.length() % 2 != 0) {
      return false;
    }

    /**
     * Use switch statement to work through the characters of the string.
     * First convert the string into a character array.
     */
    for (char c : s.toCharArray()) {

      /**
       * If the current character is aany of the opening types, push it onto the top of the stack.
       */
      switch (c) {
        case '(':
        case '[':
        case '{':
          result.push(c);
          break;

        /**
         * If its any of the closing types, check the following:
         * the stack is not empty (there should be at least one opening character.) AND
         * check that that the top element of the stack is a opening of the corresponding type.
         * If both of those are true, remove the element at the top of the stack.
         */
        case ')':
          if (c == ')' && !result.isEmpty() && result.peek() == '(') {
            result.pop();
          }
        case ']':
          if (c == ']' && !result.isEmpty() && result.peek() == '[') {
            result.pop();
          }
        case '}':
          if (c == '}' && !result.isEmpty() && result.peek() == '{') {
            result.pop();
          }
      }
    }

    /**
     * This will check that once the stirng has been iterated through, the stack is empty.
     * If the string is a valid format this will work, as every time a closing type is encountered,
     * its corresponding opening should be at the top of the stack and then removed. 
     */
    return result.isEmpty();
  }
}