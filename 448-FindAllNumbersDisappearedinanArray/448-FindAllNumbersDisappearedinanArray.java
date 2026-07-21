// Last updated: 21/07/2026, 15:24:32
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        int n = score.length;
4        String[] answer = new String[n];
5
6        int[][] arr = new int[n][2];
7
8        // Store score and original index
9        for (int i = 0; i < n; i++) {
10            arr[i][0] = score[i];
11            arr[i][1] = i;
12        }
13
14        // Sort by score in descending order
15        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
16
17        // Assign ranks
18        for (int i = 0; i < n; i++) {
19            int index = arr[i][1];
20
21            if (i == 0) {
22                answer[index] = "Gold Medal";
23            } else if (i == 1) {
24                answer[index] = "Silver Medal";
25            } else if (i == 2) {
26                answer[index] = "Bronze Medal";
27            } else {
28                answer[index] = String.valueOf(i + 1);
29            }
30        }
31
32        return answer;
33    }
34}