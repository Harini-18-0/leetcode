// Last updated: 24/07/2026, 19:27:15
1import java.util.HashMap;
2
3class Solution {
4    public int findLHS(int[] nums) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6        for (int num : nums) {
7            map.put(num, map.getOrDefault(num, 0) + 1);
8        }
9
10        int maxLen = 0;
11
12        for (int key : map.keySet()) {
13            if (map.containsKey(key + 1)) {
14                maxLen = Math.max(maxLen, map.get(key) + map.get(key + 1));
15            }
16        }
17
18        return maxLen;
19    }
20}