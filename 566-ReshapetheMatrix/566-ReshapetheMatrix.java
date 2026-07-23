// Last updated: 23/07/2026, 19:00:04
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
16
17class Solution {
18
19    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
20        if (root == null) {
21            return false;
22        }
23
24        if (isSameTree(root, subRoot)) {
25            return true;
26        }
27
28        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
29    }
30
31    private boolean isSameTree(TreeNode p, TreeNode q) {
32        if (p == null && q == null) {
33            return true;
34        }
35
36        if (p == null || q == null) {
37            return false;
38        }
39
40        if (p.val != q.val) {
41            return false;
42        }
43
44        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
45    }
46}