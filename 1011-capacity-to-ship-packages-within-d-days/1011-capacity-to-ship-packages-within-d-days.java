class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int i : weights){
            left = Math.max(left, i);
            right+=i;
        }
        while( left < right){
            int mid = left + (right-left)/2;
            if(helper(weights, days, mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    boolean helper(int[] weights, int days, int mid){
        int curr = 0;
        int day = 1;
        for(int i : weights){
            if(curr + i > mid){
                day++;
                curr = 0;
            }
            curr += i;
        }
        return (day <= days);
    }
}