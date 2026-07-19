// Last updated: 7/19/2026, 8:48:18 AM
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder ans=new StringBuilder();
        int cntx=0,cnty=0;
        
        for(char c:s.toCharArray()){
            if(c==x)
                cntx++;
            else if(c==y)
                cnty++;
            else
                ans.append(c);
        }
        while(cnty-->0){
            ans.append(y);
        }
         while(cntx-->0){
            ans.append(x);        
        }
        return ans.toString();
        
    }
}