package DataAndAlgoL.Chpt6TreeAndBinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxTreeNodeBFS {

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

    public int maxBinaryTreeBFS(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int max= Integer.MAX_VALUE;

        Queue<TreeNode> q= new LinkedList<>(); //Create queue to have Treenodes
        q.offer(root); //queue starts with node inside 
        while(!q.isEmpty()){
            TreeNode temp= q.poll(); // gets 1st node from queue to explore its descendents
            if(temp.val > max){ // check all nodes to see who has highest val until both right and left nodes next pointer points to null
                max= temp.val;
            }
            // BFS IS LEVEL ORDER LEFT TO RIGHT SO LEFT IS FIRST THEN RIGHT BY QUEUE RULES (FIFO)
            if(temp != null){ 
                if(temp.left != null){ //push left tree node to queue to explore its descendent nodes
                    q.offer(temp.left);
                }
                if(temp.right != null){ //push right tree node to queue to explore its descendent nodes
                    q.offer(temp.right);
                }
            }
        }

        return max;
    }
}
