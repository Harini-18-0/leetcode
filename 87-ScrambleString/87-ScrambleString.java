// Last updated: 20/07/2026, 18:22:12
1class Solution {
2    private Map<String, Boolean> memo = new HashMap<>();
3
4    public boolean isScramble(String s1, String s2) {
5        if (s1.equals(s2)) {
6            return true;
7        }
8
9        String key = s1 + "#" + s2;
10        if (memo.containsKey(key)) {
11            return memo.get(key);
12        }
13
14        int[] count = new int[26];
15        for (int i = 0; i < s1.length(); i++) {
16            count[s1.charAt(i) - 'a']++;
17            count[s2.charAt(i) - 'a']--;
18        }
19
20        for (int c : count) {
21            if (c != 0) {
22                memo.put(key, false);
23                return false;
24            }
25        }
26
27        int n = s1.length();
28
29        for (int i = 1; i < n; i++) {
30
31          
32            if (isScramble(s1.substring(0, i), s2.substring(0, i)) &&
33                isScramble(s1.substring(i), s2.substring(i))) {
34                memo.put(key, true);
35                return true;
36            }
37
38            if (isScramble(s1.substring(0, i), s2.substring(n - i)) &&
39                isScramble(s1.substring(i), s2.substring(0, n - i))) {
40                memo.put(key, true);
41                return true;
42            }
43        }
44
45        memo.put(key, false);
46        return false;
47    }
48}