// Last updated: 18/07/2026, 21:55:04
1import java.util.*;
2
3class Solution {
4    public String[] findWords(String[] words) {
5        
6        String row1 = "qwertyuiop";
7        String row2 = "asdfghjkl";
8        String row3 = "zxcvbnm";
9        
10        List<String> result = new ArrayList<>();
11        
12        for (String word : words) {
13            String w = word.toLowerCase();
14            
15            String row = "";
16            
17            if (row1.indexOf(w.charAt(0)) != -1) {
18                row = row1;
19            } else if (row2.indexOf(w.charAt(0)) != -1) {
20                row = row2;
21            } else {
22                row = row3;
23            }
24            
25            boolean valid = true;
26            
27            for (char c : w.toCharArray()) {
28                if (row.indexOf(c) == -1) {
29                    valid = false;
30                    break;
31                }
32            }
33            
34            if (valid) {
35                result.add(word);
36            }
37        }
38        
39        return result.toArray(new String[0]);
40    }
41}