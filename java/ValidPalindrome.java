class Solution {
  public boolean isPalindrome(String s) {

    /**
     * Check for base cases, empty string and string of length 1.
     */
    if (s.isEmpty() || s.length() == 1) {
      return true;
    }

    /**
     * Create the pointers, left to begin at character 0 and right to begin at the last character of the string.
     */
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {

      /**
       * create character variables so the left and right pointers analyze the character at the given index.
       */
      char currentLeft = s.charAt(left);
      char currentRight = s.charAt(right);

      /**
       * if the left character is not a letter or digit increase its pointer.
       */
      if (!Character.isLetterOrDigit(currentLeft)) {
        left++;
      }
      /**
       * if the right character is not a character or digit decerase its pointer.
       */
      else if (!Character.isLetterOrDigit(currentRight)) {
        right--;
      } else {
        /**
         * if the left and right character are not the same after being converted to lowercase, return fasle.
         */
        if (Character.toLowerCase(currentLeft) != Character.toLowerCase(currentRight)) {
          return false;
        }
        /**
         * Adjust the pointers accordingly.
         */
        left++;
        right--;
      }
    }
    /**
     * If all checks pass, return true.
     */
    return true;
  }
}