// Last updated: 03/08/2026, 21:21:08
1class Solution {
2    List<List<Integer>> res=new ArrayList<>();
3    public List<List<Integer>> permuteUnique(int[] nums) {
4        Arrays.sort(nums);
5        List<Integer> list=new ArrayList<>();
6        boolean[] used=new boolean[nums.length];
7        permutations(nums,used,list);
8        return res;
9    }
10    public void permutations(int[] nums,boolean[] used,List<Integer>list){
11        if(list.size()==nums.length){
12            res.add(new ArrayList<>(list));
13            return;
14        }
15        for(int i=0;i<nums.length;i++){
16            if( (i>0 && nums[i]==nums[i-1]) && !used[i-1] || (used[i]) ) continue;
17            list.add(nums[i]);
18            used[i]=true;
19            permutations(nums,used,list);
20            list.remove(list.size()-1);
21            used[i]=false;
22        }
23    }
24}