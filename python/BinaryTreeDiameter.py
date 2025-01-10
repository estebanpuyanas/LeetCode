from typing import Optional
from python.TreeNode import TreeNode

class Solution:

    # The diamater of the tree is the longest path between any two nodes, *does not* necessarily include the root. 
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:

        if root is None:
            return 0
        
        # Take the left and right heights of the trees. 
        left_height = self.height(root.left)
        right_height = self.height(root.right)

        # Given that the longest path might not pass through the node, create left and right diameter and call them recursively.
        left_diam = self.diameterOfBinaryTree(root.left)
        right_diam = self.diameterOfBinaryTree(root.right)

        # Return the max between: 1. sum of left and right heights (longest path passes through node) 2. the max of the left and right diameter (path does not pass through root)
        return max(left_height + right_height, max(left_diam, right_diam))


    # Basic height calculation method. 
    def height(self, node: Optional[TreeNode]) -> int:

        # Base case, null root. 
        if node is None:
            return 0
        
        left_height = self.height(node.left)
        right_height = self.height(node.right)

        return max(left_height, right_height) + 1