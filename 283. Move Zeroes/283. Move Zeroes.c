void moveZeroes(int* nums, int numsSize){
    int i=0;
    //int tmp;
    int y=0;
    if(numsSize!=1){
        while(i<numsSize-1){
        if(nums[i]==0){
            y=i+1;
            while(y<numsSize-1 && nums[y]==0 ){
                y++;
            }
            nums[i]=nums[y];
            nums[y]=0;
            }
        i++;
        }
    }
    
}