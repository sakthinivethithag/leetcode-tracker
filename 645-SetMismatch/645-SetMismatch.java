// Last updated: 7/10/2026, 8:49:26 PM
class Solution {
    public int[] findErrorNums(int[] nums) {

        boolean[] visited = new boolean[nums.length+1];

        int duplicate = -1;
        int missing = -1;

        for (int num : nums) {

            if (visited[num]) {
                duplicate = num;
            } else {
                visited[num] = true;
            }
        }

        for (int i = 1; i <= nums.length; i++) {

            if (!visited[i]) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}