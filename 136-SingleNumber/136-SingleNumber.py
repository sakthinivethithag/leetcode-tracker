# Last updated: 10/10/2026, 11:32:51 AM
class Solution(object):
    def singleNumber(self, nums):
        result = 0
        for num in nums:
            result ^= num
        return result