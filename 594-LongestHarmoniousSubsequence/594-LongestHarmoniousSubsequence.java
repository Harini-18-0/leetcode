// Last updated: 24/07/2026, 19:32:22
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        int count = 0;
4        int len = flowerbed.length;
5
6        for (int i = 0; i < len; i++) {
7            if (flowerbed[i] == 0) {
8                int left = (i == 0) ? 0 : flowerbed[i - 1];
9                int right = (i == len - 1) ? 0 : flowerbed[i + 1];
10
11                if (left == 0 && right == 0) {
12                    flowerbed[i] = 1;
13                    count++;
14
15                    if (count >= n) {
16                        return true;
17                    }
18                }
19            }
20        }
21
22        return count >= n;
23    }
24}