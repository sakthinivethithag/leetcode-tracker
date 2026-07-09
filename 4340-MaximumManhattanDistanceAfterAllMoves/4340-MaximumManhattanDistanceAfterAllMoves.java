// Last updated: 7/9/2026, 10:06:23 AM
class Solution {
    public int maxDistance(String moves) {
        int dx=0,dy=0;
        int wild=0;
        for(int i=0;i< moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U') dy++;
            else if (ch=='D') dy--;
            else if(ch=='R') dx++;
            else if(ch=='L')dx--;
            else if(ch=='_') wild++;
        }
        return Math.abs(dx)+Math.abs(dy)+wild;
        
    }
}