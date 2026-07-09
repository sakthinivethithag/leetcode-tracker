// Last updated: 7/9/2026, 10:08:00 AM
class Solution {
    public double myPow(double x, int n) {

        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double answer = 1.0;

        while (N > 0) {

            if ((N & 1) == 1) {
                answer *= x;
            }

            x *= x;

            N >>= 1;
        }

        return answer;
    }
}