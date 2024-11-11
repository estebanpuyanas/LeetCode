class Solution {

    /**
     * Verifies whether a given binary tree is height-balanced. 
     * A tree is considered height-balanced if the depth of the two subtrees never differs by more than 1. 
     * @param root the starting node.
     * @return whether the tree is height-balanced, or not.
     */
    public boolean isBalanced(TreeNode root){

        if(root == null){
            return true;
        }

        return Math.abs(treeHeight(root.left) - treeHeight(root.right)) < 2 &&
        isBalanced(root.left) && isBalanced(root.right);

    }

    /**
     * Helper function to get the height of the tree.
     * If the node is null, then the height of the tree is -1
     * Otherwise get the maximum height butween the left and right subtrees and add. 
     * @param node the starting node.
     * @return the height of the three.
     */
    public int treeHeight(TreeNode node){
        
        if(node == null){
            return -1;
        }
        return 1 + Math.max(treeHeight(node.left), treeHeight(node.right));
    }

}
