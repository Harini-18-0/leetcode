// Last updated: 20/07/2026, 18:08:19
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] count = new int[128];
4        for (char c : s.toCharArray()) {
5            count[c]++;
6        }
7
8        int length = 0;
9        boolean oddFound = false;
10
11        for (int freq : count) {
12            if (freq % 2 == 0) {
13                length += freq;
14            } else {
15                length += freq - 1;
16                oddFound = true;
17            }
18        }
19
20        if (oddFound) {
21            length++;
22        }
23
24        return length;
25    }
26}