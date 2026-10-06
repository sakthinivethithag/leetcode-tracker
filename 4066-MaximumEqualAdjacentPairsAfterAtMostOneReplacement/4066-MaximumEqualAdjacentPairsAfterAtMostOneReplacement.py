# Last updated: 10/6/2026, 4:26:00 PM
class Solution(object):
    def maxEqualAdjacentPairs(self, nums):
       from collections import defaultdict
       base=0
       pairs=defaultdict(int)
       for i in range(len(nums)-1):
            a=nums[i]
            b=nums[i+1]
            if a==b:
                base+=1
            else:
                pair=tuple(sorted((a,b)))
                pairs[pair]+=1
       if pairs:
            base+=max(pairs.values())
       return base
