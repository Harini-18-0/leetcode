// Last updated: 29/07/2026, 22:04:40
1class Solution {
2    public int[][] imageSmoother(int[][] img) {
3        int res[][] = new int[img.length][img[0].length];
4        for(int i = 0; i < img.length; i++) {
5            for(int j = 0; j < img[0].length; j++) {
6                res[i][j] = smoothen(img, i, j);
7            }
8        }
9        return res;
10    }
11    
12    int smoothen(int[][] img, int x, int y) {
13        int m = img.length; 
14        int n = img[0].length;
15        int sum = 0;
16        int count = 0;
17        for(int i = -1; i <= 1; i++) {
18            for(int j = -1; j <= 1; j++) {
19                int nx = x + i;
20                int ny = y + j;
21                if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
22                sum += img[nx][ny];
23                count++;
24            }
25        }
26        return sum/count;
27        
28    }
29}