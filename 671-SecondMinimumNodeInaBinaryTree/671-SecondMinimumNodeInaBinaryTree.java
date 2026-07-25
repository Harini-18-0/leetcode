// Last updated: 25/07/2026, 21:14:59
1class Solution {
2    public int findNthDigit(int n) {
3        long digits = 1;
4        long count = 9;
5        long start = 1;
6
7        // Find the digit-length group
8        while (n > digits * count) {
9            n -= digits * count;
10            digits++;
11            count *= 10;
12            start *= 10;
13        }
14
15        // Find the actual number
16        start += (n - 1) / digits;
17
18        // Convert number to string and get the digit
19        String num = Long.toString(start);
20        return num.charAt((int)((n - 1) % digits)) - '0';
21    }
22}