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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<Integer>ans=new ArrayList<>();
        if (root==null) return ans;
           q.offer(root);      
           while(!q.isEmpty()){
            int n=q.size();          
            int mx=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                TreeNode out=q.poll();
                if(out.val>mx){
                    mx=Math.max(mx,out.val);
                }               
                if(out.left!=null) q.offer(out.left); 
                if(out.right!=null) q.offer(out.right);
            }           
            ans.add(mx);
           }
           return ans;
    }
}