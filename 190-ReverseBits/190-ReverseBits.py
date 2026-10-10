# Last updated: 10/10/2026, 11:32:13 AM
class Solution(object):
    def reverseBits(self, n): 
        result = 0
        for i in range(32):
            result = (result << 1) | (n & 1)
            n >>= 1
        return result

