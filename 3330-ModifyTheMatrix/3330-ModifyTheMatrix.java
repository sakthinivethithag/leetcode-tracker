// Last updated: 7/9/2026, 10:06:51 AM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        for (int j = 0; j < n; j++) {
            int max = 0;

            for (int i = 0; i < m; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = max;
                }
            }
        }

        return matrix;
    }
}