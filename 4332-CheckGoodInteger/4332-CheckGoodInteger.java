// Last updated: 7/9/2026, 10:06:30 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        int digit;
        int digitSum=0;
        int squareSum=0;
        
        while(n>0){
            digit=n%10;
            digitSum+=digit;
            squareSum+=digit*digit;
            n/=10;
        }
        return (squareSum-digitSum>=50);
    }
}