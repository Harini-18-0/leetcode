// Last updated: 22/07/2026, 18:41:48
1class Solution {
2    public boolean checkRecord(String s) {
3        int absent = 0;
4        int late = 0;
5
6        for (char ch : s.toCharArray()) {
7            if (ch == 'A') {
8                absent++;
9                if (absent >= 2) {
10                    return false;
11                }
12                late = 0;
13            } 
14            else if (ch == 'L') {
15                late++;
16                if (late >= 3) {
17                    return false;
18                }
19            } 
20            else { // 'P'
21                late = 0;
22            }
23        }
24
25        return true;
26    }
27}