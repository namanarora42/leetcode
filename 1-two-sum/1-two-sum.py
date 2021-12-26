class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i,num1 in enumerate(nums):
            for j,num2 in enumerate(nums):
                if (num1 + num2 == target) & (i != j):
                    return [i, j]