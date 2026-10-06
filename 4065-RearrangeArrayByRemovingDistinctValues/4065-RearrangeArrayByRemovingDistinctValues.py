# Last updated: 10/6/2026, 4:25:58 PM
class Solution(object):
    def rearrangeArray(self, nums):
        from collections import Counter
        freq=Counter(nums)
        values=sorted(freq.keys())
        ans=[]
        while len(ans)<len(nums):
            for x in values:
                if freq[x]>0:
                    ans.append(x)
                    freq[x]-=1
        return ans