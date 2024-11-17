class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // If the root is null, check whether the subroot is also null and return the result of that evaluation.
        if(root == null){
            return subRoot == null;
        }

        // Run the function recursively over these three comparsions. 
        return isIdentical(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    /**
     * Helper function to determine whether two given trees are identical.
     * @param node the node of the tree.
     * @param subNode the subnode to which node is compared for equality.
     * @return true if the trees are identical, false otherwise.
     */
    public boolean isIdentical(TreeNode node, TreeNode subNode){
        //If both root nodes are null, then the tree is the same.
        if(node == null && subNode == null){
            return true;
        // If either p or q is null but the other is not, return false, as the tree is not the same.    
        } else if ((node == null || subNode == null)) {
            return false;
        // if the values of the trees differ at any point, they are not the same, return false.    
        } else if(node.val != subNode.val) {
            return false;
        } 

        return isIdentical(node.left, subNode.left) && isIdentical(node.right, subNode.right);
    }
}