from typing import Optional

from python.TreeNode import TreeNode

class Solution:

    # Function that returns the maximum depth of a binary tree.
    def maxDepth(self, root: Optional[TreeNode]) -> int:

        if root is None:
            return 0
        
        left_depth = self.maxDepth(root.left)
        right_depth = self.maxDepth(root.right)

        return max(left_depth, right_depth) + 1