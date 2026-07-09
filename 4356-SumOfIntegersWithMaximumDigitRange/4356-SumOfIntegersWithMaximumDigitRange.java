// Last updated: 7/9/2026, 10:06:27 AM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxrange=-1;
        int sum=0;
        for(int num:nums){
            int temp=num;
            int maxdigit=0;
            int mindigit=9;
            if(temp==0){
                mindigit=0;
            }
            while(temp>0){
                int digit=temp%10;
                maxdigit=Math.max(maxdigit,digit);
                mindigit=Math.min(mindigit,digit);
                temp/=10;
            }
            int range=maxdigit-mindigit;
            if(range>maxrange){
                maxrange=range;
                sum=num;
            }else if(range==maxrange){
                sum+=num;
                
            }
        }
        return sum;
        
    }
}