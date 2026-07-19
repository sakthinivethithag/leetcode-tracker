// Last updated: 7/19/2026, 4:27:57 PM
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3        int maxArea = 0;
4        int maxDiagonal = 0;
5
6        for (int[] rect : dimensions) {
7            int length = rect[0];
8            int width = rect[1];
9
10            int diagonal = length * length + width * width;
11            int area = length * width;
12
13            if (diagonal > maxDiagonal) {
14                maxDiagonal = diagonal;
15                maxArea = area;
16            } else if (diagonal == maxDiagonal) {
17                maxArea = Math.max(maxArea, area);
18            }
19        }
20
21        return maxArea;
22    }
23}