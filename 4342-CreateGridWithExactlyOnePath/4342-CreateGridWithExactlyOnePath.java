// Last updated: 7/9/2026, 10:06:25 AM
class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid=new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]='#';
            }
        }
        int r=0,c=0;
        grid[r][c]='.';
        while(c<n-1){
            c++;
            grid[r][c]='.';
            if(c<n-1&&r<m-1){
                r++;
                grid[r][c]='.';
            }
        }
        while(r<m-1){
            r++;
            grid[r][c]='.';
        }
        String[] ans=new String[m];
        for(int i=0;i<m;i++){
            ans[i]=new String(grid[i]);
        }
        return ans;
    }
}