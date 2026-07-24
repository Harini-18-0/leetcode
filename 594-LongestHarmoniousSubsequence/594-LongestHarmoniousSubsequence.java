// Last updated: 24/07/2026, 19:31:37
1class Solution {
2    public int findIntegers(int n) {
3        int[] dp = new int[32];
4        dp[0] = 1;
5        dp[1] = 2;
6
7        // Build Fibonacci-like DP
8        for (int i = 2; i < 32; i++) {
9            dp[i] = dp[i - 1] + dp[i - 2];
10        }
11
12        int ans = 0;
13        int prevBit = 0;
14
15        // Traverse bits from MSB to LSB
16        for (int i = 30; i >= 0; i--) {
17            if ((n & (1 << i)) != 0) {
18                ans += dp[i];
19
20                if (prevBit == 1) {
21                    return ans;
22                }
23
24                prevBit = 1;
25            } else {
26                prevBit = 0;
27            }
28        }
29
30        return ans + 1;
31    }
32}