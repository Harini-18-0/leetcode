// Last updated: 23/07/2026, 18:57:12
1class Solution {
2    public int maxDepth(Node root) {
3        if (root == null) {
4            return 0;
5        }
6
7        int max = 0;
8
9        for (Node child : root.children) {
10            max = Math.max(max, maxDepth(child));
11        }
12
13        return max + 1;
14    }
15}