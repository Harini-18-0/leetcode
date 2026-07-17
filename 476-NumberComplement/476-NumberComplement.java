// Last updated: 17/07/2026, 21:22:51
1class Solution {
2    public int findComplement(int num) {
3        int mask = 1;
4
5        while (mask < num) {
6            mask = (mask << 1) | 1;
7        }
8
9        return num ^ mask;
10    }
11}