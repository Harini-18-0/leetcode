// Last updated: 28/07/2026, 20:32:50
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
18         if(root1 == null && root2 == null){
19            return null;
20        }
21        if (root1 == null || root2 == null) {
22            return root1 == null?root2:root1;
23            
24        }
25        TreeNode res = new TreeNode(root1.val+root2.val);
26        res.left = mergeTrees(root1.left,root2.left);
27        res.right = mergeTrees(root1.right,root2.right);
28        return res;
29    }
30}