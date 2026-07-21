// Last updated: 21/07/2026, 15:26:26
1class Solution {
2    public int findLUSlength(String a, String b) {
3        if (a.equals(b)) {
4            return -1;
5        }
6
7        return Math.max(a.length(), b.length());
8    }
9}