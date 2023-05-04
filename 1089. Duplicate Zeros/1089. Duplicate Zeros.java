class Solution {
    public void duplicateZeros(int[] arr) {
        int i;
        
        for(i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                int k = arr.length-1;
                while(k > i){
                    arr[k] = arr[k-1];
                    k--;
                }
                i++;
            }
        }
    }
}