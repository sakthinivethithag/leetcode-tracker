// Last updated: 8/9/2026, 8:36:36 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        double total=0;
6        int i=prices.length-1;
7        int j=discounts.length-1;
8        while(i>=0&&j>=0){
9            total+=prices[i]*(100-discounts[j])/100.0;
10            i--;
11            j--;
12        }
13        while(i>=0){
14            total+=prices[i];
15            i--;
16        }
17        return total;
18    }
19}