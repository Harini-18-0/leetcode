// Last updated: 29/07/2026, 22:05:42
1class MyHashSet {
2
3    private boolean[] storage;
4
5    public MyHashSet() {
6        storage = new boolean[1_000_001]; // Initialize array for keys in range [0, 1000000]
7    }
8
9    public void add(int key) {
10        storage[key] = true; // Mark key as present
11    }
12
13    public void remove(int key) {
14        storage[key] = false; // Mark key as absent
15    }
16
17    public boolean contains(int key) {
18        return storage[key]; // Check if key is present
19    }
20}