# Last updated: 10/6/2026, 4:26:15 PM
class Solution:
    def isPalindromic(self, s: str) -> bool:
        binary=""
        for ch in s:
            binary+=format(ord(ch),'08b')
        return binary==binary[::-1]
        