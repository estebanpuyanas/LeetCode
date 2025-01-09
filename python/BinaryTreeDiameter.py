from typing import Optional
from python.TreeNode import TreeNode

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:

        if root is None:
            return 0
        
        left_height = self.height(root.left)
        right_height = self.height(root.right)

        left_diam = self.diameterOfBinaryTree(root.left)
        right_diam = self.diameterOfBinaryTree(root.right)

        return max(left_height + right_height, max(left_diam, right_diam))


    def height(self, node: Optional[TreeNode]) -> int:

        if node is None:
            return 0
        
        left_height = self.height(node.left)
        right_height = self.height(node.right)

        return max(left_height, right_height) + 1