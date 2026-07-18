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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode out=q.poll();
                list.add(out.val);
                if(out.left!=null)q.offer(out.left);
                if(out.right!=null)q.offer(out.right);
            }
            ans.add(list);
        }
        Collections.reverse(ans);
        return ans;
    }
}