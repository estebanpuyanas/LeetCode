"""
Given the string array words, and the string prefix, return the number of strings in words that contain prefix. 
"""


from typing import List


# Create global count variable to keep track of number of words with prefix. 
class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        
        count = 0

        # Use startswith() built-in method to check fir wird having prefix.
        for i in len(words):
            if words[i].startswith(pref):
                count += 1
            else:
                continue

        # Return the count. 
        return count
        