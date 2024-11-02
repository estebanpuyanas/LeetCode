class Solution {

    public int maxDepth(TreeNode root) {

        //If the root of the tree is null just retur 0.
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
