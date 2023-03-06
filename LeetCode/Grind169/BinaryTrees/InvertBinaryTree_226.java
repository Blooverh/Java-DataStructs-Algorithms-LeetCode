package Grind169.BinaryTrees;

public class InvertBinaryTree_226 {

    
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

    public static TreeNode invertTree(TreeNode root) {
        TreeNode save= null;

        while(root != null){
            save= root.left;
            root.left= root.right;
            root.right= save;
            invertTree(root.right);
            invertTree(root.left);
            return root;
        }

        return null;
        
    }
}
