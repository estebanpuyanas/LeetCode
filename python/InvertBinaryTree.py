from typing import Optional

from python.TreeNode import TreeNode

class Solution:

    # Function to invert a binary tree.
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:

        # Base case, if the root is null, return null. 
        if root is None:
            return None
        
        #The following variable transaction is important to be able to invert the tree.

        # create a new tempnode which points to the right child of root.
        tempNode = root.right

        # Make the right child of the root point to the left child of the root. 
        root.right = root.left

        # Make the left child of the root point to the temporary node.
        root.left = tempNode

        # Call the function recursively until the base case is reached.
        self.invertTree(root.left)
        self.invertTree(root.right)

        # Return the root.
        return root
