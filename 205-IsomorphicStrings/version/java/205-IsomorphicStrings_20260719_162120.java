// Last updated: 7/19/2026, 4:21:20 PM
1import java.util.*;
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5        HashSet<Integer> set = new HashSet<>();
6
7        for (int num : nums) {
8            set.add(num);
9        }
10
11        int longest = 0;
12
13        for (int num : set) {
14            if (!set.contains(num - 1)) {
15                int current = num;
16                int length = 1;
17
18                while (set.contains(current + 1)) {
19                    current++;
20                    length++;
21                }
22
23                longest = Math.max(longest, length);
24            }
25        }
26
27        return longest;
28    }
29}