class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        if(x==0)
        return true;
        
        int length = (int) Math.log10(x) + 1; 
        int[] digits = new int[length]; 
        int index = length - 1;  
        while (x > 0) {
            int digit = x % 10; 
            digits[index] = digit; 
            index--; 
            x /= 10; 
        }
        int i = 0;
        while(i<length/2){
            if(digits[i]!=digits[length-i-1])
            return false;
            i++;
        }
        return true;

        
    }
}