package Grind169.BinaryTrees;

public class SymmetricTree_101 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
        this.right = right;
        }
    }

    public static void main(String[] args) {
        
    }

    //helper method 
    public boolean isSymmetric(TreeNode root) {
        //if root is null than there is no tree hence not symmetric
        if(root == null){ return false;}
        // check whether next nodes are equal
        return  checkSymmetric(root.left, root.right); 
    }

    public boolean checkSymmetric(TreeNode leftParent, TreeNode rightParent){
        //checks whether nodes are both null or one is null anf other not
        if(leftParent == null && rightParent == null){return true;}
        if(leftParent == null || rightParent == null){return false;}
        //check whether the value of each node is not equal
        if(leftParent.val != rightParent.val){return false;}

        return checkSymmetric(leftParent.left, rightParent.right) && checkSymmetric(leftParent.right, rightParent.left);

    }
}
