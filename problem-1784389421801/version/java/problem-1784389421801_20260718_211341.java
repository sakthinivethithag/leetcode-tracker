// Last updated: 7/18/2026, 9:13:41 PM
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        StringBuilder ans=new StringBuilder();
4        int cntx=0,cnty=0;
5        
6        for(char c:s.toCharArray()){
7            if(c==x)
8                cntx++;
9            else if(c==y)
10                cnty++;
11            else
12                ans.append(c);
13        }
14        while(cnty-->0){
15            ans.append(y);
16        }
17         while(cntx-->0){
18            ans.append(x);        
19        }
20        return ans.toString();
21        
22    }
23}