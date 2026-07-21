// Last updated: 21/07/2026, 15:25:16
1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        if (num <= 1) {
4            return false;
5        }
6
7        int sum = 1;
8
9        for (int i = 2; i * i <= num; i++) {
10            if (num % i == 0) {
11                sum += i;
12
13                if (i != num / i) {
14                    sum += num / i;
15                }
16            }
17        }
18
19        return sum == num;
20    }
21}