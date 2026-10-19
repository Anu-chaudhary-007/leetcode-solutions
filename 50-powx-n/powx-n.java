class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            N = -N;
        }
        
        double ans = binaryPow(x, N);
        
        if (n < 0) {
            return 1.0 / ans;
        }
        return ans;
    }
    
    private double binaryPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        
        double half = binaryPow(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
