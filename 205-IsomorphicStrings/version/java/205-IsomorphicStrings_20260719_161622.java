// Last updated: 7/19/2026, 4:16:22 PM
1import java.util.*;
2
3class Solution {
4    public boolean isIsomorphic(String s, String t) {
5        if (s.length() != t.length()) {
6            return false;
7        }
8
9        HashMap<Character, Character> map = new HashMap<>();
10        HashMap<Character, Character> reverse = new HashMap<>();
11
12        for (int i = 0; i < s.length(); i++) {
13            char c1 = s.charAt(i);
14            char c2 = t.charAt(i);
15
16            if (map.containsKey(c1)) {
17                if (map.get(c1) != c2) {
18                    return false;
19                }
20            } else {
21                if (reverse.containsKey(c2)) {
22                    return false;
23                }
24                map.put(c1, c2);
25                reverse.put(c2, c1);
26            }
27        }
28
29        return true;
30    }
31}