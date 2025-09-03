class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCounter = 0, n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) 
                zeroCounter++;
            else{
                nums[i-zeroCounter] = nums[i];
            }
        }
        for(int i = n-zeroCounter; i<n; i++){
            nums[i] = 0;
        }
    }
}