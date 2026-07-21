// Last updated: 21/07/2026, 15:19:39
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> result = new ArrayList<>();
4
5        // Mark visited numbers
6        for (int i = 0; i < nums.length; i++) {
7            int index = Math.abs(nums[i]) - 1;
8            if (nums[index] > 0) {
9                nums[index] = -nums[index];
10            }
11        }
12
13        // Find missing numbers
14        for (int i = 0; i < nums.length; i++) {
15            if (nums[i] > 0) {
16                result.add(i + 1);
17            }
18        }
19
20        return result;
21    }
22}