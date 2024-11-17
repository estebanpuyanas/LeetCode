import java.util.HashMap;
import java.util.Map;

class Solution {

  /**
   * Function that will return the indices in an array that sum to a target number.
   * @param nums the list of numbers.
   * @param target the target sum.
   * @return an array containing the index number of the values that add up to target.
   */
  public int[] twoSum(int[] nums, int target) {

    // Use hashmap for scalability. Hashmaps have constant time look up so better than doing nested loops.
    Map<Integer, Integer> numsMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {

      // now create a complement (result - number being evaluated)
      // which gets analyzed as the loop iterates through.
      int result = target - nums[i];

      // if the hashmap contains the complement,
      // return a new array with the complement and the ith element.
      if (numsMap.containsKey(result)) {
        return new int[]{numsMap.get(result), i};
      }

      // Access the hashmap, put the ith element and its index in the hashmap.
      numsMap.put(nums[i], i);
    }

    throw new IllegalArgumentException("No valid solution was found");
  }
}