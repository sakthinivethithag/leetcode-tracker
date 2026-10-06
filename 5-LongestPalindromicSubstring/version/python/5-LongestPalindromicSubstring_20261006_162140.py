# Last updated: 10/6/2026, 4:21:40 PM
1class Solution:
2    def longestPalindrome(self, s):
3        start = 0
4        end = 0
5
6        def expand(left, right):
7            while left >= 0 and right < len(s) and s[left] == s[right]:
8                left -= 1
9                right += 1
10
11            return left + 1, right - 1
12
13        for i in range(len(s)):
14            l1, r1 = expand(i, i)
15
16            l2, r2 = expand(i, i + 1)
17
18            if r1 - l1 > end - start:
19                start = l1
20                end = r1
21
22            if r2 - l2 > end - start:
23                start = l2
24                end = r2
25
26        return s[start:end + 1]