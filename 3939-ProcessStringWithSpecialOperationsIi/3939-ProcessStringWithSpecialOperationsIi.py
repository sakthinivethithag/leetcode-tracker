# Last updated: 7/9/2026, 10:06:39 AM
class Solution:
    def processStr(self, s: str, k: int) -> str:
        m = 0

        for c in s:
            if c == '*':
                m = max(0, m - 1)
            elif c == '#':
                m *= 2
            elif c != '%':
                m += 1

        if k >= m:
            return '.'

        for c in reversed(s):
            if c == '*':
                m += 1

            elif c == '#':
                m //= 2
                if k >= m:
                    k -= m

            elif c == '%':
                k = m - 1 - k

            else:
                m -= 1
                if k == m:
                    return c

        return '.'   # IMPORTANT