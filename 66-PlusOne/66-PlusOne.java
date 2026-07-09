// Last updated: 7/9/2026, 10:07:57 AM
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;   // add 1 and stop
                return digits;
            }

            digits[i] = 0; // becomes 10 → set to 0 and carry forward
        }

        // if all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}