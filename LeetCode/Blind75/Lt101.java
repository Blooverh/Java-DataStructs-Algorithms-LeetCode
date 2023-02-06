package Blind75;

import java.util.Stack;

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
public class Lt101 {
    public static void main(String[] args) {
        
    }

    //Recursive solution fastest
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null){ return false;}

        return  checkSymmetric(root.left, root.right);
    }

    public boolean checkSymmetric(TreeNode leftParent, TreeNode rightParent){

        if(leftParent == null && rightParent == null){return true;}
        if(leftParent == null || rightParent == null){return false;}
        if(leftParent.val != rightParent.val){return false;}

        return checkSymmetric(leftParent.left, rightParent.right) && checkSymmetric(leftParent.right, rightParent.left);

    }
    //Iterative solution slower than recursion and with stack help
    public boolean isSymmetric2(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.empty()) {
            TreeNode n1 = stack.pop(), n2 = stack.pop();
            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null || n1.val != n2.val) return false;
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }
        return true;
    }
}
