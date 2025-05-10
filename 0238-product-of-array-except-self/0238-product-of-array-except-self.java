class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] sol = new int[nums.length];
        sol[0] = 1;
        for(int i = 1; i < nums.length; i++){
            sol[i] = nums[i-1] * sol[i-1];
        }
        int r = 1;
        for(int i = nums.length-1; i >= 0; i--){
            sol[i] *= r;
            r *= nums[i];
        }
        return sol;
    }
}