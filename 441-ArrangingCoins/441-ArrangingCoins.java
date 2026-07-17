// Last updated: 17/07/2026, 21:24:11
1class Solution {
2    public int arrangeCoins(int n) {
3        int row = 1;
4
5        while (n >= row) {
6            n -= row;
7            row++;
8        }
9
10        return row - 1;
11    }
12}