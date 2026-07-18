// Last updated: 18/07/2026, 21:55:42
1class Solution {
2    public String convertToBase7(int num) {
3        
4        if (num == 0) {
5            return "0";
6        }
7        
8        boolean negative = num < 0;
9        num = Math.abs(num);
10        
11        StringBuilder sb = new StringBuilder();
12        
13        while (num > 0) {
14            sb.append(num % 7);
15            num = num / 7;
16        }
17        
18        if (negative) {
19            sb.append('-');
20        }
21        
22        return sb.reverse().toString();
23    }
24}