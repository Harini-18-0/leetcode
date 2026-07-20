// Last updated: 20/07/2026, 18:06:38
1class Solution {
2    public String toHex(int num) {
3        if (num == 0) return "0";
4
5        char[] hex = {
6            '0','1','2','3','4','5','6','7',
7            '8','9','a','b','c','d','e','f'
8        };
9
10        StringBuilder sb = new StringBuilder();
11
12        while (num != 0) {
13            sb.append(hex[num & 15]);
14            num >>>= 4;               
15        }
16
17        return sb.reverse().toString();
18    }
19}