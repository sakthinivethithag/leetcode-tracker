# Last updated: 10/10/2026, 11:34:05 AM
class Solution:
    def isMatch(self, s, p):
        m = len(s)
        n = len(p)

        dp = [[False] * (n + 1) for _ in range(m + 1)]

        dp[0][0] = True

        # Empty string with patterns like a*, a*b*, a*b*c*
        for j in range(2, n + 1):
            if p[j - 1] == '*':
                dp[0][j] = dp[0][j - 2]

        for i in range(1, m + 1):
            for j in range(1, n + 1):

                # Current characters match
                if p[j - 1] == '.' or p[j - 1] == s[i - 1]:
                    dp[i][j] = dp[i - 1][j - 1]

                # Current pattern character is '*'
                elif p[j - 1] == '*':
                    # '*' matches zero characters
                    dp[i][j] = dp[i][j - 2]

                    # '*' matches one or more characters
                    if p[j - 2] == '.' or p[j - 2] == s[i - 1]:
                        dp[i][j] = dp[i][j] or dp[i - 1][j]

        return dp[m][n]