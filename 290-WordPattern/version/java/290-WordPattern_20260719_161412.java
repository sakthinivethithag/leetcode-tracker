// Last updated: 7/19/2026, 4:14:12 PM
1import java.util.*;
2
3class Solution {
4    public boolean wordPattern(String pattern, String s) {
5        String[] words = s.split(" ");
6
7        if (pattern.length() != words.length) {
8            return false;
9        }
10
11        HashMap<Character, String> map = new HashMap<>();
12        HashMap<String, Character> reverse = new HashMap<>();
13
14        for (int i = 0; i < pattern.length(); i++) {
15            char ch = pattern.charAt(i);
16            String word = words[i];
17
18            if (map.containsKey(ch)) {
19                if (!map.get(ch).equals(word)) {
20                    return false;
21                }
22            } else {
23                if (reverse.containsKey(word)) {
24                    return false;
25                }
26                map.put(ch, word);
27                reverse.put(word, ch);
28            }
29        }
30
31        return true;
32    }
33}