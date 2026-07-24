// Last updated: 24/07/2026, 19:29:09
1class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        if (ops.length == 0) {
4            return m * n;
5        }
6
7        int minA = m;
8        int minB = n;
9
10        for (int[] op : ops) {
11            minA = Math.min(minA, op[0]);
12            minB = Math.min(minB, op[1]);
13        }
14
15        return minA * minB;
16    }
17}