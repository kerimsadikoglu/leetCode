class Solution {
public int[] findErrorNums(int[] nums) {
    int[] t = new int[nums.length];
    int res[] = new int[2];
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
        if(t[nums[i] - 1] == 1){
            res[0] = nums[i];
        }
        t[nums[i] - 1] = 1;
        sum += i + 1 - nums[i];
    }
    res[1] = res[0] + sum;
    return res;
}
};