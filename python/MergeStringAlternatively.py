class Solution:

    # Function to merge strings alternatively
    def mergeAlternately(self, word1: str, word2: str) -> str:
        
        # Use empty array to store chars of words, will be used with join() to return.
        result = []

        # Get length of words.
        w1Len = len(word1)
        w2Len = len(word2)

        i = 0
        j = 0

        # While i,j less than length of corresponding words, merge each char alternatively into the result array.
        while i < w1Len or j < w2Len:
            if i < w1Len:
                result +=  word1[i]
                i = i + 1
            if j < w2Len:
                result += word2[j]
                j = j + 1

        # Since function must return a string, join the result array with an empty string. 
        return "".join(result)

