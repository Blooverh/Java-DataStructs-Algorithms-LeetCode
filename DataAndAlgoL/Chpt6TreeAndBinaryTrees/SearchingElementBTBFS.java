package DataAndAlgoL.Chpt6TreeAndBinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class SearchingElementBTBFS {
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

        public static void main(String[] args) {
            
        }

        public static boolean SearchinElementInBTBFS(TreeNode root, int data){
            if(root ==null){
                return false;
            }

            Queue<TreeNode> q= new LinkedList<>();
            q.offer(root);

            while(root !=null){
                TreeNode temp= q.poll();
                if(temp.val == data){
                    return true;
                }

                if(temp != null){
                    if(temp.val > data){
                        q.offer(temp.right);
                    }

                    if(temp.val < data){
                        q.offer(temp.left);
                    }
                }
            }

            return false;
            
        }
    }
}
