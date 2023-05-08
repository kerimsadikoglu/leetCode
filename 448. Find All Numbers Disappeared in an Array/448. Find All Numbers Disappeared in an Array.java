class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int index=0;
        int y=0;
        int f=0;

        Arrays.sort(nums);
        for(int i=1;i<=nums.length;i++){
            index =  Arrays.binarySearch(nums, i);
            if(index<0){
                result.add(i);
            }


        }

        return result;
    }
}