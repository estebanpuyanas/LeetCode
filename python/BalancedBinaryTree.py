from typing import Optional

from python.TreeNode import TreeNode

class Solution:

    # Since the balabnce of the tree checks that at any given node, the height difference is not > 1, use height helper method to check.
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        
        # Base case, null root.
        if root is None:
            return True
        
        left_balance = self.height(root.left)
        right_balance = self.height(root.right)

        if abs(left_balance - right_balance) > 1:
            return False
        else: return self.isBalanced(root.left) and self.isBalanced(root.right)


    # Basic helper method to get the height of the tree. 
    def height(self, node: Optional[TreeNode]) -> int:
        
        if node is None:
            return 0
        
        left_height = self.height(node.left)
        right_height = self.height(node.right)

        return max(left_height, right_height) + 1
     