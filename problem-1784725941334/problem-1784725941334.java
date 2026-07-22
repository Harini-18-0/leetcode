// Last updated: 22/07/2026, 18:42:21
1import java.util.Arrays;
2
3class Solution {
4    public int arrayPairSum(int[] nums) {
5        Arrays.sort(nums);
6
7        int sum = 0;
8
9        for (int i = 0; i < nums.length; i += 2) {
10            sum += nums[i];
11        }
12
13        return sum;
14    }
15}