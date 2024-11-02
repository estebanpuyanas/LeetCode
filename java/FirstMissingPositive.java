import java.util.HashSet;

class Solution {
  public int firstMissingPositive(int[] nums) {
    int result = 1;
    HashSet<Integer> set = new HashSet<>();

    //All integers that are greater than 0, add to the hashset
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        set.add(nums[i]);
      }
    }

    // if the set is empty, there were no positive numbers, so return 0
    if (set.isEmpty()) {
      return result;
    }

    // While the hashset contains the result number, increment by one
    while (set.contains(result)) {
      result++;
    }

    //once the previous condition is not true, return the result.
    return result;
  }

}
