from _ast import List

class Solution:

    # Function to check whether a given list of numbers contains a duplicate element.
    def contains_duplicate(self, nums: List[int]) -> bool:
        # Sort the list.
        nums.sort()

        # Loop through the list and do the following:
        # Check whether the current index is equal to the index after it. If so, return true.
        # Otherwise, return false.
        for i in range(len(nums) - 1):
            if nums[i] == nums[i + 1]:
                return True
        return False
