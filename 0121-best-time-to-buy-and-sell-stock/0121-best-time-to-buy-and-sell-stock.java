class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = 10000;
        int maxProfit = 0;
        for(int i : prices){
            if( i < minPrice){
                minPrice = i;
            }
            maxProfit = Math.max(maxProfit, i - minPrice);
        }
        return maxProfit;
    }
}