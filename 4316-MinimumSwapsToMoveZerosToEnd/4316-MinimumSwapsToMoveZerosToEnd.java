// Last updated: 7/9/2026, 10:06:33 AM
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