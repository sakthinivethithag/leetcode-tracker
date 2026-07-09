// Last updated: 7/9/2026, 10:15:48 AM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3
4        boolean[] visited = new boolean[nums.length + 1];
5
6        int duplicate = -1;
7        int missing = -1;
8
9        for (int num : nums) {
10
11            if (visited[num]) {
12                duplicate = num;
13            } else {
14                visited[num] = true;
15            }
16        }
17
18        for (int i = 1; i <= nums.length; i++) {
19
20            if (!visited[i]) {
21                missing = i;
22                break;
23            }
24        }
25
26        return new int[]{duplicate, missing};
27    }
28}