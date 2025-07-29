class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0; 
        int sol = Integer.MAX_VALUE;
        int tempSum = nums[0];
        if(tempSum == target) return 1;
        int len = nums.length;
        for(int i = 1; i < len; i++){
            tempSum += nums[i];
            while(tempSum > target){
                tempSum -= nums[left++];
                sol = Math.min(sol, i-left+1);
            }            
        }
        return sol == Integer.MAX_VALUE ? 0 : sol;
    }
}