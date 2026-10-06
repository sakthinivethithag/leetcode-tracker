// Last updated: 10/6/2026, 4:27:18 PM
class Solution {
    public int minimumSwaps(int[] nums) {
        int zeros = 0;

        for (int num : nums) {
            if (num == 0) {
                zeros++;
            }
        }

        int swaps = 0;
        int n = nums.length;

        for (int i = n - zeros; i < n; i++) {
            if (nums[i] != 0) {
                swaps++;
            }
        }

        return swaps;
    }
}