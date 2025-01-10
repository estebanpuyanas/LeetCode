class Solution:

    # Function that checks whether any two strings are anagrams.
    def is_anagram(self, s: str, t: str) -> bool:

        # Base case, s and t are of different lengths they cannot have the same letters therefore impossible to rearrange.
        if len(s) != len(t):
            return False

        # Strip of extra whitespace
        s.strip()
        t.strip()

        # Convert into arrays and sort, this will allow to check for array equality rapidly. 
        sArray = list(s)
        tArray = list(t)
        sArray.sort()
        tArray.sort()

        if sArray == tArray:
            return True
