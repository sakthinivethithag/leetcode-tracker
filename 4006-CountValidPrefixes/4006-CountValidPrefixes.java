// Last updated: 10/6/2026, 4:26:25 PM
class Solution {
    public int countValidPrefixes(String s) {
        int z=0,o=0,a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')
                z++;
            else
                o++;
            if(Math.abs(z-o)<=1)
                a++;
        }
        return a;
        
    }
}