// Last updated: 23/07/2026, 18:59:10
1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        int m = mat.length;
4        int n = mat[0].length;
5
6        // Check if reshape is possible
7        if (m * n != r * c) {
8            return mat;
9        }
10
11        int[][] result = new int[r][c];
12
13        for (int i = 0; i < m * n; i++) {
14            result[i / c][i % c] = mat[i / n][i % n];
15        }
16
17        return result;
18    }
19}