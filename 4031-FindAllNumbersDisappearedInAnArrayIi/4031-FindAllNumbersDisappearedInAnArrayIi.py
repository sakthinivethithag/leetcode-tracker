# Last updated: 10/6/2026, 4:25:55 PM
class Solution(object):
    def findDisappearedNumbers(self, nums, lower, upper):
        nums=sorted(set(nums))
        result=[]
        prev=lower-1
        for num in nums:
            if num<lower or num>upper:
                continue
            if num>prev+1:
                result.append([prev+1,num-1])
            prev=num
        if prev<upper:
            result.append([prev+1,upper])
        return result
                
        