class Solution {
    public boolean isPowerOfThree(int n) {
        boolean x=true;
        if(n<=0){
            return false;
        }
        while(n>1 && x){
            if(n%3!=0){
                x=false;
            }
            n=n/3;
        }
        return x;
    }
}