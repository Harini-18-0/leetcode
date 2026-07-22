// Last updated: 22/07/2026, 18:42:59
1import java.util.*;
2
3class Solution {
4    public String nearestPalindromic(String n) {
5        int len = n.length();
6        long num = Long.parseLong(n);
7
8        Set<Long> candidates = new HashSet<>();
9
10        // Edge cases
11        candidates.add((long) Math.pow(10, len - 1) - 1);
12        candidates.add((long) Math.pow(10, len) + 1);
13
14        long prefix = Long.parseLong(n.substring(0, (len + 1) / 2));
15
16        for (long i = prefix - 1; i <= prefix + 1; i++) {
17            String first = String.valueOf(i);
18            String second;
19
20            if (len % 2 == 0) {
21                second = new StringBuilder(first).reverse().toString();
22            } else {
23                second = new StringBuilder(first.substring(0, first.length() - 1))
24                        .reverse().toString();
25            }
26
27            candidates.add(Long.parseLong(first + second));
28        }
29
30        candidates.remove(num);
31
32        long ans = -1;
33
34        for (long cand : candidates) {
35            if (ans == -1 ||
36                Math.abs(cand - num) < Math.abs(ans - num) ||
37                (Math.abs(cand - num) == Math.abs(ans - num) && cand < ans)) {
38                ans = cand;
39            }
40        }
41
42        return String.valueOf(ans);
43    }
44}