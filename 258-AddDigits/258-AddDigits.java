// Last updated: 7/9/2026, 10:07:05 AM
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum=0;
            
            while(num>0){
                int digit=num%10;
                sum+=digit;
                num/=10;
            }
            num=sum;
        }
        return num;
       
        
    }
}