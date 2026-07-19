// Last updated: 7/19/2026, 8:47:58 AM
1import java.util.*;
2
3class Solution {
4    public int missingInteger(int[] nums) {
5        int sum = nums[0];
6
7        int i = 1;
8        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
9            sum += nums[i];
10            i++;
11        }
12
13        HashSet<Integer> set = new HashSet<>();
14        for (int num : nums) {
15            set.add(num);
16        }
17
18        while (set.contains(sum)) {
19            sum++;
20        }
21
22        return sum;
23    }
24}