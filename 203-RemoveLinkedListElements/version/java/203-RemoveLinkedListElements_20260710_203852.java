// Last updated: 7/10/2026, 8:38:52 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        if (s.length() != t.length()) {
5            return false;
6        }
7
8        int[] count = new int[26];
9
10        for (int i = 0; i < s.length(); i++) {
11            count[s.charAt(i) - 'a']++;
12            count[t.charAt(i) - 'a']--;
13        }
14
15        for (int num : count) {
16            if (num != 0) {
17                return false;
18            }
19        }
20
21        return true;
22    }
23}