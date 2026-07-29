// Last updated: 29/07/2026, 22:07:15
1class Solution {
2    public boolean isOneBitCharacter(int[] bits) {
3        int n = bits.length;
4        int i = 0;
5        while(i < n - 1)
6            i += bits[i] + 1;
7        return i == n - 1;
8    }
9}
10