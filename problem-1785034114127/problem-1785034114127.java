// Last updated: 26/07/2026, 08:18:34
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s<0 || s>9*n){
4            return -1;
5        }
6        int res=0;
7        for(int i=0;i<n;i++){
8            int dig=Math.min(9,s);
9            res=res*10+dig;
10            s -=dig;
11        }
12        return res;
13    }
14}