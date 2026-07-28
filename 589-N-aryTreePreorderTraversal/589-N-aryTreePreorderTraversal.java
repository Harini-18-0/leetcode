// Last updated: 28/07/2026, 20:29:05
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
21    public List<Integer> preorder(Node root) {
22        List<Integer> result = new ArrayList<>();
23        traverse(root, result);
24        return result;
25    }
26
27    private void traverse(Node node, List<Integer> result) {
28        if (node == null) return;
29
30        result.add(node.val);
31
32        for (Node child : node.children) {
33            traverse(child, result);
34        }
35    }
36}