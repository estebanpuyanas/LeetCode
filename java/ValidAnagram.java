import java.util.Arrays;

class Solution {
  /**
   * Function that checks whether any two strings are anagrams.
   * @param s the first string.
   * @param t the second string.
   * @return whether the strings are the same.
   */
  public boolean isAnagram(String s, String t) {
    // Trim both strings to remove unecessary information. 
    s.trim();
    t.trim();

    // Convert both into char arrays to manipulate them easier.
    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();

    // Sort the arrays so the characters are the same at all spots in the array.
    Arrays.sort(sArray);
    Arrays.sort(tArray);

    // If the arrays are not equal in their content, return false, otherwise return true. 
    return Arrays.equals(sArray, tArray);
  }
}