// Last updated: 7/10/2026, 8:48:24 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3
4        int i = 0;
5        int j = 0;
6
7        while (i < s.length() && j < t.length()) {
8
9            if (s.charAt(i) == t.charAt(j)) {
10                i++;
11            }
12
13            j++;
14        }
15
16        return i == s.length();
17    }
18}