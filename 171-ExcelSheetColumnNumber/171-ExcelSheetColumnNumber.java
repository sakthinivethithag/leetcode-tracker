// Last updated: 7/9/2026, 10:07:29 AM
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;

            result = result * 26 + value;
        }

        return result;
    }
}