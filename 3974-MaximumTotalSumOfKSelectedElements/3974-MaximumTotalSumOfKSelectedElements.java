// Last updated: 10/6/2026, 4:26:57 PM
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