// Last updated: 8/2/2026, 9:17:32 AM
1class Solution {
2    public int countRatioSubarrays(int[] nums, int a, int b) {
3        int n=nums.length;
4        int ans=0;
5        for(int i=0;i<n;i++){
6            int e=0,o=0;
7            for(int j=i;j<n;j++){
8                if(nums[j]%2==0)
9                    e++;
10                else
11                    o++;
12                if(o>0&&1L*e*b<=1L*o*a){
13                    ans++;
14                }
15            }
16        }
17        return ans;
18    }
19}