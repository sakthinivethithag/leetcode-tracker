# Last updated: 10/6/2026, 4:26:02 PM
class Solution(object):
    def countSpecialIntegers(self, nums):
        count=0
        for x in set(nums):
            first=nums.index(x)
            last=len(nums)-1-nums[::-1].index(x)
            if all(nums[i]==x for i in range(first,last+1)):
                count+=1
               
        return count
        