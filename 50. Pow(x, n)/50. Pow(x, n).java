class Solution {
   
    public double myPow(double x, int n) {
        if (n < 0) return 1.0 / pow(x, n);
        else return pow(x, n);
    }
    public double pow(double x, int n) {
        if (n == 0) return 1.0;
        double y = pow(x, n / 2);
        if (n % 2 == 0) {
            return y * y;
        } else {
            return y * y * x;
        }
    }
}