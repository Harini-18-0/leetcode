// Last updated: 24/07/2026, 19:30:26
1import java.util.*;
2
3class Solution {
4    public String[] findRestaurant(String[] list1, String[] list2) {
5        HashMap<String, Integer> map = new HashMap<>();
6
7        // Store strings from list1 with their indices
8        for (int i = 0; i < list1.length; i++) {
9            map.put(list1[i], i);
10        }
11
12        List<String> result = new ArrayList<>();
13        int minSum = Integer.MAX_VALUE;
14
15        // Traverse list2
16        for (int j = 0; j < list2.length; j++) {
17            if (map.containsKey(list2[j])) {
18                int sum = j + map.get(list2[j]);
19
20                if (sum < minSum) {
21                    minSum = sum;
22                    result.clear();
23                    result.add(list2[j]);
24                } else if (sum == minSum) {
25                    result.add(list2[j]);
26                }
27            }
28        }
29
30        return result.toArray(new String[0]);
31    }
32}