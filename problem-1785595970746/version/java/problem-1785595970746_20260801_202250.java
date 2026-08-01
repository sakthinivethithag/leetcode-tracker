// Last updated: 8/1/2026, 8:22:50 PM
1class Solution {
2    public int countValidPrefixes(String s) {
3        int z=0,o=0,a=0;
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='0')
6                z++;
7            else
8                o++;
9            if(Math.abs(z-o)<=1)
10                a++;
11        }
12        return a;
13        
14    }
15}