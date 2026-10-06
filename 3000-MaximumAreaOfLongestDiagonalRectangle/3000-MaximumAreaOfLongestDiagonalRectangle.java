// Last updated: 10/6/2026, 4:27:43 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        int maxDiagonal = 0;

        for (int[] rect : dimensions) {
            int length = rect[0];
            int width = rect[1];

            int diagonal = length * length + width * width;
            int area = length * width;

            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}