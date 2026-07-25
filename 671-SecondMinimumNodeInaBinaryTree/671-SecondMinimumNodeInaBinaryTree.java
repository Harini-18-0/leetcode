// Last updated: 25/07/2026, 21:13:18
1class Solution {
2    public int findLengthOfLCIS(int[] nums) {
3        int max = 1;
4        int count = 1;
5
6        for (int i = 1; i < nums.length; i++) {
7            if (nums[i] > nums[i - 1]) {
8                count++;
9            } else {
10                count = 1;
11            }
12            max = Math.max(max, count);
13        }
14
15        return max;
16    }
17}