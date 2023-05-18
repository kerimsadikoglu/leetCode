public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int pivot = 1;
        int sum = 0;
        for (int i = 0; i < 32; i ++){
            int p = pivot << i;
            if ((n & p) == p)
                sum ++;
        }
        return sum;
    }
}