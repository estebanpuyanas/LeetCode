class Solution {

    /**
     * Function that evaluates the diameter of a binary tree.
     * @param root the starting node of the tree.
     * @return the diamater of the tree.
     */
    public int diameterOfBinaryTree(TreeNode root) {

        //Base case null/empty tree.
        if(root == null){
            return 0;
        }

        /**
         * Get the left and right heights.
         */
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        /**
         * Call algo recursively over the left and right subtrees
         */
        int leftDiam = diameterOfBinaryTree(root.left);
        int rightDiam = diameterOfBinaryTree(root.right);

        return Math.max(leftHeight + rightHeight, Math.max(leftDiam, rightDiam));
    }

    /**
     * Helper method used to calculate the height of the tree.
     * Returns the longest height because we want the longest path between any two nodes.
     */
    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        return (1 + Math.max(height(node.left), height(node.right)));
    }
}