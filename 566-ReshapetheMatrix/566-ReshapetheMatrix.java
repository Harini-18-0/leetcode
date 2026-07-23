// Last updated: 23/07/2026, 19:01:28
1import java.util.HashSet;
2
3class Solution {
4    public int distributeCandies(int[] candyType) {
5        HashSet<Integer> set = new HashSet<>();
6
7        for (int candy : candyType) {
8            set.add(candy);
9        }
10
11        return Math.min(set.size(), candyType.length / 2);
12    }
13}