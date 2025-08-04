class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int cheapest = prices[0];
        for(int i : prices){
            if(i < cheapest){
                cheapest = i;
            }
            else{
                max = Math.max(max, i - cheapest);
            }
        }
        return max;
    }
}