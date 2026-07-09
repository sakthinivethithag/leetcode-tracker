// Last updated: 7/9/2026, 10:07:31 AM
class Solution {
    public int majorityElement(int[] nums) {
        int coming=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                coming=num;
            }
            if(num==coming)
                count++;
            else
                count--;
        }
        return coming;
        
    }
}