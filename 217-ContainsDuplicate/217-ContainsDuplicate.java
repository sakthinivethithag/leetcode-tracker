// Last updated: 7/9/2026, 10:07:07 AM
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }
            else{
               set.add(num);
            }
        }

        return false;
    }
}