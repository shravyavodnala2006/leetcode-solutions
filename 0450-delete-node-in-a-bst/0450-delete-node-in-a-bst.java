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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;

        if(root.val<key) 
            root.right=deleteNode(root.right,key);
        else if(root.val>key) 
            root.left=deleteNode(root.left,key);
        else {
            if(root.left==null){
                TreeNode temp=root.right;
                
                return temp;
            }
            else if(root.right==null){
                TreeNode temp=root.left;
              
                return temp;
            }
            else{
                TreeNode temp=getMax(root.left);
                root.val=temp.val;
                root.left=deleteNode(root.left,temp.val);
              
            }
        }
        return root;
    }
    static TreeNode getMax(TreeNode root) {
    while (root.right!=null){
        root = root.right;
    }
    return root;
    }
}