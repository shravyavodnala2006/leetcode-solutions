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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            double sum=0;
            for(int i=0;i<n;i++){
                TreeNode out=q.poll();
                sum+=out.val;
                if(out.left!=null)q.offer(out.left);
                if(out.right!=null)q.offer(out.right);
            }
            double avg=sum/n;
            ans.add(avg);
        }
        
        return ans;
    }
}