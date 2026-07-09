// Last updated: 7/9/2026, 10:06:21 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0;
        int idx=nums.length-1;
        for(int i=0;i<k;i++){
            int num=nums[idx--];
            long multiplier=(long)mul-i;
            ans+=Math.max((long)num,(long)num*multiplier); 
        }
        return ans;
    }
}