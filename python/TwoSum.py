from _ast import List
from typing import List

class Solution:

    # Function that will return the indices in an array that sum to a target number.
    def two_sum(self, nums: List[int], target: int) -> List[int]:

        # create empty dictionary to store the values. 
        dictionary = {}

        # the length of the passed list that will be iterared through later on. 
        n = len(nums)

        # iterate through n times. 
        # result equals to the target number - the current value of x
        # if the result is already in the dictionary, return list with the key of the dictionary and the value of the index
        # assign x to the current value of the dictionary 
        for x in range(n):
            result = target - nums[x]
            if result in dictionary:
                return [dictionary[result], x]
            dictionary[nums[x]] = x

        # retutrn empty dictionary if no criteria are met. 
        return  []