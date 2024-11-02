// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.HashSet;

class Solution {
  public int solution(int[] A) {
    int result = 1;
    HashSet<Integer> set = new HashSet<>();

    //All integers that are greater than 0, add to the hashset
    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        set.add(A[i]);
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
