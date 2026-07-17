// Last updated: 17/07/2026, 21:25:59
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder sb = new StringBuilder();
4        int count = 0;
5
6        for (int i = s.length() - 1; i >= 0; i--) {
7            char ch = s.charAt(i);
8
9            if (ch == '-') {
10                continue;
11            }
12
13            if (count == k) {
14                sb.append('-');
15                count = 0;
16            }
17
18            sb.append(Character.toUpperCase(ch));
19            count++;
20        }
21
22        return sb.reverse().toString();
23    }
24}