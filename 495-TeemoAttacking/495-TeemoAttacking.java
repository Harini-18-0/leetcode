// Last updated: 18/07/2026, 21:53:56
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        
4        int total = 0;
5        
6        for (int i = 0; i < timeSeries.length - 1; i++) {
7            total += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
8        }
9        
10        // Add poison duration for the last attack
11        total += duration;
12        
13        return total;
14    }
15}