class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int i=0;
        int y=0;
        while(i<nums.length){
            if(nums[i]==1){
                y++;
                if(y>max)
                    max=y;              
                
            }else{
                y=0;
            }
            i++;
        
                
        }
        
        
        return max;
    }
    
}