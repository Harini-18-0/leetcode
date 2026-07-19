// Last updated: 19/07/2026, 08:27:48
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
17    private int count=0;
18    public int countDominantNodes(TreeNode root) {
19        dfs(root);
20        return count;
21    }
22    private int dfs(TreeNode node){
23        if(node==null){
24            return Integer.MIN_VALUE;            
25        }
26        int leftMax=dfs(node.left);
27        int rightMax=dfs(node.right);
28        int currMax=Math.max(node.val,Math.max(leftMax,rightMax));
29        if(node.val==currMax){
30            count++;
31        }
32        return currMax;
33    }
34}