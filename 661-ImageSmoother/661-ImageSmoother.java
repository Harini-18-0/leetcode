// Last updated: 29/07/2026, 22:06:17
1class MyHashMap {
2    int[] data;
3    public MyHashMap() {
4        data = new int[1000001];
5        Arrays.fill(data, -1);
6    }
7    public void put(int key, int val) {
8        data[key] = val;
9    }
10    public int get(int key) {
11        return data[key];
12    }
13    public void remove(int key) {
14        data[key] = -1;
15    }
16}