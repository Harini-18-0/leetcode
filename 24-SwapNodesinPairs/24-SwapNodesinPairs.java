// Last updated: 31/07/2026, 09:13:15
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode swapPairs(ListNode head) {
13         ListNode dummy = new ListNode(0);
14    dummy.next = head;
15
16    ListNode point = dummy;
17
18   
19    while (point.next != null && point.next.next != null) {
20
21      ListNode swap1 = point.next;
22      ListNode swap2 = point.next.next;
23
24    
25      swap1.next = swap2.next;
26      swap2.next = swap1;
27
28
29    
30      point.next = swap2;
31      point = swap1;
32    }
33
34   
35    return dummy.next;
36    }
37}