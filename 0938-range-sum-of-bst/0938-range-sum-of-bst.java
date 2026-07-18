/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {  
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        if(root==null) return sum;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);     
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode out=q.poll();
                if(low<=out.val && out.val<=high) sum+=out.val;
                if(out.left!=null)q.offer(out.left);
                if(out.right!=null)q.offer(out.right);
            }        
        }       
        return sum;
    }
}