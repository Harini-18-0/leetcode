// Last updated: 20/07/2026, 18:14:25
1class Solution {
2    public List<String> fizzBuzz(int n) {
3        List<String> answer = new ArrayList<>();
4
5        for (int i = 1; i <= n; i++) {
6            if (i % 15 == 0) {
7                answer.add("FizzBuzz");
8            } else if (i % 3 == 0) {
9                answer.add("Fizz");
10            } else if (i % 5 == 0) {
11                answer.add("Buzz");
12            } else {
13                answer.add(String.valueOf(i));
14            }
15        }
16
17        return answer;
18    }
19}