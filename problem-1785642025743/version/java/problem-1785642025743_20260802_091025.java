// Last updated: 8/2/2026, 9:10:25 AM
1class Solution {
2    public long maxPairStrength(int[] nums) {
3        long ans=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                long g=gcd(nums[i],nums[j]);
7                long strength=(1L*nums[i]*nums[j])/(g*g);
8                ans=Math.max(ans,strength);
9            }
10        }
11        return ans;
12    }
13    private long gcd(long a,long b){
14        while(b!=0){
15            long temp =a%b;
16            a=b;
17            b=temp;
18        }
19        return a;
20    }
21}