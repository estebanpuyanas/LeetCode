import java.util.Arrays;

class Solution {
  public boolean isAnagram(String s, String t) {
    s.trim();
    t.trim();

    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();

    Arrays.sort(sArray);
    Arrays.sort(tArray);

    return Arrays.equals(sArray, tArray);
  }
}