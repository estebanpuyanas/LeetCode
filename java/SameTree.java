class Solution {

    /**
     * Function that evaluates whether two binary trees are the same.
     * @param p the first tree.
     * @param q the second tree.
     * @return True if the trees are the same, false otherwise.
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        //If both root nodes are null, then the tree is the same.
        if(p == null && q == null){
            return true;
        // If either p or q is null but the other is not, return false, as the tree is not the same.    
        } else if ((p != null && q == null) || (p == null && q != null)) {
            return false;
        // if the values of the trees differ at any point, they are not the same, return false.    
        } else if(p.val != q.val) {
            return false;
        } 

        // run the function recursively on the left and right childs of the tree. 
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}