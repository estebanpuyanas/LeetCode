import java.util.ArrayList;
import java.util.List;

class Solution {

  /**
   * Function that evaluates number in arrays and appends the approriate result to a list.
   * @param n the number to be evaluated up to.
   * @return A list of strings containing the results after operations.
   */
  public List<String> fizzBuzz(int n) {

    // List to contain all the results from the algorithm.
    List<String> result = new ArrayList<>();

    // Start the loop at 1 given the resulting array is 1-indexed and no nums are div by 0.
    for (int i = 1; i <= n; i++) {
      if ((i % 3 == 0) && (i % 5 == 0)) {
        result.add("FizzBuzz");
      } else if (i % 3 == 0) {
        result.add("Fizz");
      } else if (i % 5 == 0) {
        result.add("Buzz");
      } else {
        // If the number is not divisible by three, five or either, simply return the value of the number. 
        result.add(String.valueOf(i));
      }
    }
    // Return the result box. 
    return result;
  }
}