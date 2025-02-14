class Solution {

    /**
     * Function to invert a binary tree.
     * @param root the starting node.
     * @return the inverted binary tree, pointing to the root node.
     */
    public TreeNode invertTree(TreeNode root) {

        // Base case, null tree.
        if (root == null) {
            return null;
        }

        /** First create a temporary node that points to the right child of the root.
         * Since the nodes at each level will be swapped, simply assign right to left
         * and left to the tempNode
         */
        TreeNode tempNode = root.right;
        root.right = root.left;
        root.left = tempNode;

        // Call function recursively on the left/right subroots of the tree.
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}

