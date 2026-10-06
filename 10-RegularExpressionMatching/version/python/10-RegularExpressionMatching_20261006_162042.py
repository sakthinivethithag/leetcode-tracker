# Last updated: 10/6/2026, 4:20:42 PM
1class Solution:
2    def isMatch(self, s, p):
3        m = len(s)
4        n = len(p)
5
6        dp = [[False] * (n + 1) for _ in range(m + 1)]
7
8        dp[0][0] = True
9
10        # Empty string with patterns like a*, a*b*, a*b*c*
11        for j in range(2, n + 1):
12            if p[j - 1] == '*':
13                dp[0][j] = dp[0][j - 2]
14
15        for i in range(1, m + 1):
16            for j in range(1, n + 1):
17
18                # Current characters match
19                if p[j - 1] == '.' or p[j - 1] == s[i - 1]:
20                    dp[i][j] = dp[i - 1][j - 1]
21
22                # Current pattern character is '*'
23                elif p[j - 1] == '*':
24                    # '*' matches zero characters
25                    dp[i][j] = dp[i][j - 2]
26
27                    # '*' matches one or more characters
28                    if p[j - 2] == '.' or p[j - 2] == s[i - 1]:
29                        dp[i][j] = dp[i][j] or dp[i - 1][j]
30
31        return dp[m][n]