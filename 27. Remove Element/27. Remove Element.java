class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int r=0;
        
        while(i<nums.length){
            if(nums[i]==val){
                r++;
            }else{
                nums[i-r]=nums[i];
            }
            i++;
        }
        return nums.length-r;
    }
}