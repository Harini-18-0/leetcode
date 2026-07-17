// Last updated: 17/07/2026, 21:29:32
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int count = 0;
4        int max = 0;
5
6        for (int num : nums) {
7            if (num == 1) {
8                count++;
9                max = Math.max(max, count);
10            } else {
11                count = 0;
12            }
13        }
14
15        return max;
16    }
17}