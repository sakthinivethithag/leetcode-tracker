# Last updated: 8/23/2026, 8:53:10 AM
1class Solution(object):
2    def findDisappearedNumbers(self, nums, lower, upper):
3        nums=sorted(set(nums))
4        result=[]
5        prev=lower-1
6        for num in nums:
7            if num<lower or num>upper:
8                continue
9            if num>prev+1:
10                result.append([prev+1,num-1])
11            prev=num
12        if prev<upper:
13            result.append([prev+1,upper])
14        return result
15                
16        