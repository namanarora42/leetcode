class Solution:
    # def subArrayRanges(self, nums: List[int]) -> int:
    #     res = 0
    #     for i in range(len(nums)):
    #         for j in range(i,len(nums)):
    #             if j>=i:
    #                 subarr = nums[i:j+1]
    #                 r = max(subarr) - min(subarr)
    #                 res += r
    #     return res

    def subArrayRanges(self, A):
        res = 0
        n = len(A)
        for i in range(n):
            l,r = A[i],A[i]
            for j in range(i, n):
                l = min(l, A[j])
                r = max(r, A[j])
                res += r - l
        return res