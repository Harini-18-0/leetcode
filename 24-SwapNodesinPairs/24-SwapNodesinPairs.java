// Last updated: 31/07/2026, 09:15:28
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        // To return the elements directly from the private function we make 
4        return new int[] {first(nums, target )  , last(nums , target)};
5    }
6
7    // Function that would return the first occurence 
8    private int first(int [] arr , int target){
9        // Binary Search Basics eh 
10        int left = 0 ; 
11        int right = arr.length -1; 
12        // To to store the mid and if there no value it will directly give -1 
13        int ans = -1;
14
15        // Standard Binary Search Conditon 
16        while(left<=right){
17            int mid = left + (right - left) / 2;
18
19            
20            // If the mid is target that does not guranetee that its the first occurence duh
21            // But it does tell us that the first occurrence is at mid or left to mid 
22            if(arr[mid] == target ){
23
24                // So we store the mid in ans in case if thats the first occurence 
25                ans = mid;
26                // Then we make the right to the mid -1
27                right = mid - 1;
28            }
29            // If the target is greater than the ofc it would be to right side of the mid 
30            else if (arr[mid]<target){
31                left = mid + 1; 
32            }
33            // If the target is not in the mid not greater than mid it surely would be in left of mid or not present at all 
34            else{
35                right = mid -1 ; 
36            }
37        }
38        // Return what ever that answer is 
39        return ans ; 
40
41    }
42
43
44    private int last (int [] arr , int target){
45        int left = 0; 
46        int right = arr.length-1;
47        int ans = -1;
48
49        while(left <= right ){
50            int mid = left + (right - left )/2; 
51
52            if (arr[mid] == target ){
53                ans = mid ;
54                left = mid+1 ; 
55            }
56            else if (arr[mid]>target ){
57                right = mid -1;
58            }else{
59                left = mid + 1; 
60            }
61        }
62        return ans ;
63    }
64}