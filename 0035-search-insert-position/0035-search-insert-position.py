class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        for x in range(len(nums)):
            if nums[x] == target:
                return x
            if nums[x]>target:
                return x
            if x == len(nums)-1:
                return len(nums)