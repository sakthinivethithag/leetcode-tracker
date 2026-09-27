# Last updated: 9/27/2026, 8:16:31 AM
1class Solution(object):
2    def maxEqualAdjacentPairs(self, nums):
3       from collections import defaultdict
4       base=0
5       pairs=defaultdict(int)
6       for i in range(len(nums)-1):
7            a=nums[i]
8            b=nums[i+1]
9            if a==b:
10                base+=1
11            else:
12                pair=tuple(sorted((a,b)))
13                pairs[pair]+=1
14       if pairs:
15            base+=max(pairs.values())
16       return base
17