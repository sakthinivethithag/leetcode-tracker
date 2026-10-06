// Last updated: 10/6/2026, 4:27:14 PM
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int e=0,o=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==0)
                    e++;
                else
                    o++;
                if(o>0&&1L*e*b<=1L*o*a){
                    ans++;
                }
            }
        }
        return ans;
    }
}