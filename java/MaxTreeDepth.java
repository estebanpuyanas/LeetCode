class Solution {

    /**
     * Function that returns the maximum depth of a binary tree.
     * @param root the starting node.
     * @return the maximum depth of the tree.
     */
    public int maxDepth(TreeNode root) {

        //If the root of the tree is null just return 0, because the max depth is 0.
        if(root == null){
            return 0;
        }

        //Create leftDepth and rightDepth variables that call maxDepth recursively
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        //Use the max function to determine which tree is deeper, +1 to include root.
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
