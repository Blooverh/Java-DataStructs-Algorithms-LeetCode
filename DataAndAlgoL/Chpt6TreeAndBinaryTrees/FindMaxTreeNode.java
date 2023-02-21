package DataAndAlgoL.Chpt6TreeAndBinaryTrees;
//Problem-1 Give an algorithm for finding maximum element in binary tree.

public class FindMaxTreeNode {
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

    public static int maxBinaryTreeNode(TreeNode root){
        int maxVal= Integer.MIN_VALUE;
        if(root != null){
            int rightMax= maxBinaryTreeNode(root.right);
            int leftMax= maxBinaryTreeNode(root.left);

            if(leftMax > rightMax){
                maxVal=leftMax;
            }else{
                maxVal=rightMax;
            }

            if(root.val > maxVal){
                maxVal=root.val;
            }
        }

        return maxVal;
    }


}
