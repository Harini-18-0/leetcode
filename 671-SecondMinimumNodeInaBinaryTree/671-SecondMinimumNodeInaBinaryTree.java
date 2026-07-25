// Last updated: 25/07/2026, 21:14:23
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> countStack = new Stack<>();
4        Stack<StringBuilder> stringStack = new Stack<>();
5
6        StringBuilder current = new StringBuilder();
7        int num = 0;
8
9        for (char ch : s.toCharArray()) {
10            if (Character.isDigit(ch)) {
11                num = num * 10 + (ch - '0');
12            } 
13            else if (ch == '[') {
14                countStack.push(num);
15                stringStack.push(current);
16                num = 0;
17                current = new StringBuilder();
18            } 
19            else if (ch == ']') {
20                int repeat = countStack.pop();
21                StringBuilder prev = stringStack.pop();
22
23                for (int i = 0; i < repeat; i++) {
24                    prev.append(current);
25                }
26
27                current = prev;
28            } 
29            else {
30                current.append(ch);
31            }
32        }
33
34        return current.toString();
35    }
36}