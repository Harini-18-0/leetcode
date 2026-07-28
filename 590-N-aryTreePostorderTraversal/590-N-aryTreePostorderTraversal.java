// Last updated: 28/07/2026, 20:31:42
1/*
2 // Definition for a Node.
3 class Node {
4     public int val;
5     public List<Node> children;
6
7     public Node() {}
8
9     public Node(int _val) {
10         val = _val;
11     }
12
13     public Node(int _val, List<Node> _children) {
14         val = _val;
15         children = _children;
16     }
17 };
18*/
19
20class Solution {
21    public List<Integer> postorder(Node root) {
22        List<Integer> result = new ArrayList<>();
23        traverse(root, result);
24        return result;
25    }
26
27    private void traverse(Node node, List<Integer> result) {
28        if (node == null) return;
29
30        for (Node child : node.children) {
31            traverse(child, result);
32        }
33
34        result.add(node.val);
35    }
36}