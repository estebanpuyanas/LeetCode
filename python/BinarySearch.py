from typing import List

class Solution:

    # Binary search method.
    def binary_search(self, nums: List[int], target: int) -> int:
        
        # Create left and right pointers.
        left = 0
        right = len(nums) - 1

        # While the left pointer is less than right pointer do the following:
        # Create a middle pointer. 
        # If the middle is the target number, return it. 
        # If the middle pointer to the array is greater than the target, adjust the right pointer.
        # Otherwise, adjust the left pointer. 
        # Otherwise if the number cannot be found, return -1

        while left <= right:
            middle = left + (right - left) // 2
            if nums[middle] == target:
                return middle
            if nums[middle] > target:
                right = middle - 1
            else:
                left = middle + 1
        return - 1
