# Last updated: 10/10/2026, 11:32:57 AM

class Solution(object):
    def isPalindrome(self, s):

        s = ''.join(ch.lower() for ch in s if ch.isalnum())
        return s == s[::-1]

