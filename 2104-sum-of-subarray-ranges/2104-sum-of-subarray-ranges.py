class Solution:


    def subArrayRanges(self, A):
        res = 0
        n = len(A)
        for i in range(n):
            leftPtr = A[i]
            rightPtr = A[i]
            for j in range(i, n):
                leftPtr = min(leftPtr, A[j])
                rightPtr = max(rightPtr, A[j])
                res += rightPtr - leftPtr
        return res