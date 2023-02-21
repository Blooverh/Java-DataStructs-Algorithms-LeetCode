package DataAndAlgoL.Chpt6TreeAndBinaryTrees;

public class SearchinElementBinaryTree {
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
    //SEARCHING USING RECURSION 
    public static boolean findElementTreeNode(TreeNode root, int data){
        if(root == null){
            return false;
        }

        if(root.val == data){
            return true;
        }

        return findElementTreeNode(root.right, data) || findElementTreeNode(root.left, data);
    }
}
