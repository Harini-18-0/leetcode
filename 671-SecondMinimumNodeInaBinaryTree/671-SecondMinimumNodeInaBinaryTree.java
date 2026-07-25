// Last updated: 25/07/2026, 21:12:44
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
17    private long second = Long.MAX_VALUE;
18    private int min;
19
20    public int findSecondMinimumValue(TreeNode root) {
21        min = root.val;
22        dfs(root);
23
24        return second == Long.MAX_VALUE ? -1 : (int) second;
25    }
26
27    private void dfs(TreeNode node) {
28        if (node == null) return;
29
30        if (node.val > min && node.val < second) {
31            second = node.val;
32        }
33
34        dfs(node.left);
35        dfs(node.right);
36    }
37}