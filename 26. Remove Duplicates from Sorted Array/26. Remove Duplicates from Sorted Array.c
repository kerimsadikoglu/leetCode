class Solution {
        public int removeDuplicates(int[] nums) {
    
        int x=1;
        
        for(int y=x ; y < nums.length; y++)
        {
            if(nums[y] > nums[x-1])
            {
                nums[x++]=nums[y];
            }
        }
        return x;
    }
}