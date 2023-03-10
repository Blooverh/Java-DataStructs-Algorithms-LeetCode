package LeetcodeV1;
//Definition for a binary tree node.
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

public class Lt100 {
    public static void main(String[] args) {
        
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q== null){
            return true;
        }
        if(p== null && q != null || p!=null && q==null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
