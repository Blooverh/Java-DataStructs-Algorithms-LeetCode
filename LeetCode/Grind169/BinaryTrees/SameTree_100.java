package Grind169.BinaryTrees;

public class SameTree_100 {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both root nodes p and q are null tree is true 
        if(p==null && q== null){
            return true;
        }

        //if one root is not null and the other root is null they are not the same tree thus false
        if(p== null && q != null || p!=null && q==null){
            return false;
        }

        // if both nodes do not have the same value then return false
        if(p.val != q.val){
            return false;
        }
        // recursive call for both left nodes of each root node and right node of each root
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
