from typing import Optional

from python.TreeNode import TreeNode

class Solution:

    # Function that returns the maximum depth of a binary tree.
    def maxDepth(self, root: Optional[TreeNode]) -> int:

        # Base case null tree.
        if root is None:
            return 0
        
        # Since depth = height, need to analyze the left and right subtrees. 
        left_depth = self.maxDepth(root.left)
        right_depth = self.maxDepth(root.right)

        # Return biggest height, +1 to account for root node. 
        return max(left_depth, right_depth) + 1