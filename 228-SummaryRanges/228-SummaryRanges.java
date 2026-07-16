// Last updated: 16/07/2026, 19:25:13
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        List<String> result = new ArrayList<>();
4
5        int i = 0;
6
7        while (i < nums.length) {
8            int start = nums[i];
9
10            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
11                i++;
12            }
13
14            int end = nums[i];
15
16            if (start == end) {
17                result.add(String.valueOf(start));
18            } else {
19                result.add(start + "->" + end);
20            }
21            i++;
22        }
23       return result;
24    }
25}