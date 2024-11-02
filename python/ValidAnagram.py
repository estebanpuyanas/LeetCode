class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        s.strip()
        t.strip()
        sArray = list(s)
        tArray = list(t)
        sArray.sort()
        tArray.sort()

        if sArray == tArray:
            return True
