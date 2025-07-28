class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] maxOnRight = new int[n];
        int max = 0;
        maxOnRight[n-1] = 0;
        for(int i = n-2; i >= 0; i--){
            maxOnRight[i] = Math.max(maxOnRight[i+1], prices[i+1]);
        }
        for(int i = 0; i < n-1; i++){
            max = Math.max(max, maxOnRight[i]-prices[i]);
        }
        return max;
    }
}