from typing import Optional

from python.TreeNode import TreeNode

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        
        if root is None:
            return True
        
        left_balance = self.height(root.left)
        right_balance = self.height(root.right)

        if abs(left_balance - right_balance) > 1:
            return False
        else: return self.isBalanced(root.left) and self.isBalanced(root.right)


    def height(self, node: Optional[TreeNode]) -> int:
        
        if node is None:
            return 0
        
        left_height = self.height(node.left)
        right_height = self.height(node.right)

        return max(left_height, right_height) + 1
     