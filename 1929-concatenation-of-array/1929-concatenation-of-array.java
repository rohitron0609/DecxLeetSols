class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] sol = new int[2*n];
        for(int i = 0; i < n; i++){
            sol[i] = nums[i];
            sol[i+n] = nums[i];
        }
        return sol;
    }
}