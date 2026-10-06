# Last updated: 10/6/2026, 4:25:15 PM
1class Solution:
2    def fourSum(self, nums, target):
3        nums.sort()
4        n = len(nums)
5        result = []
6
7        for i in range(n - 3):
8
9            if i > 0 and nums[i] == nums[i - 1]:
10                continue
11
12            for j in range(i + 1, n - 2):
13
14                if j > i + 1 and nums[j] == nums[j - 1]:
15                    continue
16
17                left = j + 1
18                right = n - 1
19
20                while left < right:
21                    total = nums[i] + nums[j] + nums[left] + nums[right]
22
23                    if total == target:
24                        result.append([
25                            nums[i],
26                            nums[j],
27                            nums[left],
28                            nums[right]
29                        ])
30
31                        while left < right and nums[left] == nums[left + 1]:
32                            left += 1
33
34                        while left < right and nums[right] == nums[right - 1]:
35                            right -= 1
36
37                        left += 1
38                        right -= 1
39
40                    elif total < target:
41                        left += 1
42
43                    else:
44                        right -= 1
45
46        return result