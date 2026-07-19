// Last updated: 7/19/2026, 8:48:27 AM
import java.util.*;

class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        int i = 1;
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}