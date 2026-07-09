// Last updated: 7/9/2026, 10:06:28 AM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int middle=nums[nums.length/2];
        int count=0;
        for(int num:nums){
            if(num==middle){
                count++;
            }
        }
        return count==1;
    }
}