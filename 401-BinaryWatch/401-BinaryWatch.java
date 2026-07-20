// Last updated: 20/07/2026, 18:00:40
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        List<String> result = new ArrayList<>();
4            for (int hour = 0; hour < 12; hour++) {
5            for (int minute = 0; minute < 60; minute++) {
6                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {                   
7                    result.add(hour + ":" + String.format("%02d", minute));
8                }
9            }
10        }
11        
12        return result;
13    }
14}