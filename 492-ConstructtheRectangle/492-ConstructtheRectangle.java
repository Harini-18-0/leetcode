// Last updated: 18/07/2026, 21:53:06
1class Solution {
2    public int[] constructRectangle(int area) {
3        
4        for (int w = (int)Math.sqrt(area); w >= 1; w--) {
5            if (area % w == 0) {
6                int l = area / w;
7                return new int[]{l, w};
8            }
9        }
10        
11        return new int[]{area, 1};
12    }
13}