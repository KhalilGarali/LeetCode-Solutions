class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        # pointer = len(nums)-1
        # for i in range(len(nums)):
        #     if pointer == i:
        #         break
        #     if nums[pointer] == val:
        #         pointer-=1
        #     if nums[i] != val:
        #         print("Skipping iteration because it is not the same value")
        #         continue
        #     if nums[i] == val:
        #         nums[i] = nums[pointer]
        #         pointer-=1
        #         print("Pointer index: " + str(pointer))
        #         print("Iteration index: " + str(i))
        # return pointer+1
        i = 0
        for x in nums:
            if x != val:
                nums[i] = x
                i += 1
        return i