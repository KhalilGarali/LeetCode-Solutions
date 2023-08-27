class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        pointer = 1
        for i in range(1, len(nums)):
            if nums[i-1] != nums[i]:
                nums[pointer] = nums[i]
                pointer +=1
        return pointer