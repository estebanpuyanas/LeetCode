class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        
        result = []

        w1Len = len(word1)
        w2Len = len(word2)

        i = 0
        j = 0

        while i < w1Len or j < w2Len:
            if i < w1Len:
                result +=  word1[i]
                i = i + 1
            if j < w2Len:
                result += word2[j]
                j = j + 1

        return "".join(result)

