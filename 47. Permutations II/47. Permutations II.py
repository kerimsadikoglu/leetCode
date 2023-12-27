class Solution(object):
    def permuteUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def backtrack(start):
            if start == len(nums):
                result.append(nums[:])  # Append a copy of the current permutation
                return
            
            used = set()  # To keep track of used elements at each level
            for i in range(start, len(nums)):
                if nums[i] in used:
                    continue  # Skip duplicates at the same level
                used.add(nums[i])
                nums[start], nums[i] = nums[i], nums[start]  # Swap elements
                backtrack(start + 1)
                nums[start], nums[i] = nums[i], nums[start]  # Backtrack
        
        result = []
        nums.sort()  # Sort the input list to handle duplicates
        backtrack(0)
        return result
