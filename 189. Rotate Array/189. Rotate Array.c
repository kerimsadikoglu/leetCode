void rotate(int* nums, int numsSize, int k){
    if (numsSize == 1) {
        return;
    }
    k = k % numsSize;
    int *front_array = (int *)(malloc(k * sizeof(int)));
    int *second_array = (int *)(malloc((numsSize - k) * sizeof(int)));
    int j = 0;
    int z = 0;
    int cut_off = numsSize - k;
    for (int i = 0; i < cut_off; i += 1) {
        second_array[j] = nums[i];
        j += 1; 
    }
    for (int i = cut_off; i < numsSize ; i += 1) {
        front_array[z] = nums[i];
        z += 1;
    }
    for (int i = 0; i < k; i += 1) {
        nums[i] = front_array[i];
    }
    int element_th = 0;
    for (int i = k; i < numsSize; i += 1) {
        nums[i] = second_array[element_th];
        element_th += 1;
    }
    free(front_array);
    free(second_array);
}