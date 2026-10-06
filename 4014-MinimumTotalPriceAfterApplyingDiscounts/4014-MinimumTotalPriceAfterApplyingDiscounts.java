// Last updated: 10/6/2026, 4:26:35 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double total=0;
        int i=prices.length-1;
        int j=discounts.length-1;
        while(i>=0&&j>=0){
            total+=prices[i]*(100-discounts[j])/100.0;
            i--;
            j--;
        }
        while(i>=0){
            total+=prices[i];
            i--;
        }
        return total;
    }
}