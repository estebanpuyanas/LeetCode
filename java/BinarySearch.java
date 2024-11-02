import java.util.Arrays;

class Solution {
  public int search(int[] nums, int target) {
    return binarySearch(nums, target, 0, nums.length - 1);
  }

  /**
   * Binary search helper method.
   *
   * @param array  the array which will be searched.
   * @param target the traget element to be found.
   * @param left   the left subarray.
   * @param right  the right subarray
   * @return, the appropriate index of the element, if it exists.
   */
  public int binarySearch(int[] array, int target, int left, int right) {

    /**
     * not necessary for this leetocde problem,
     * but if the array was not sorted, this would be necessary:
     * Arrays.sort(array);
     */

    /**
     * Create a middle pointer to divide the array into.
     */
    int middle = left + (right - left) / 2;


    /**
     * If the left subarray is greater than the right, the element does not exist. Base case of this algorithm.
     */
    if (left > right) {
      return -1;
    }


    /**
     * Recursive cases:
     * 1. If the middle index is the target, return the middle number.
     * 2. Else if, the middle index is less than the target, recursively call the algorithm,
     *    this time making left = middle + 1.
     * 3. Else, recursively call the algorithm this time adjusting right = middle -1.    
     */
    if (array[middle] == target) {
      return middle;
    } else if (array[middle] < target) {
      return binarySearch(array, target, middle + 1, right);
    } else {
      return binarySearch(array, target, left, middle - 1);
    }
  }
}