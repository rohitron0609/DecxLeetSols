class Solution {
    public int findMiddleIndex(int[] nums) {
        int right = 0, total = 0, left = 0;
        for(int i : nums){
            total += i;
        }

        for(int i = 0; i < nums.length; i++){
            right = total - left - nums[i];
            if(right == left)
                return i;
            left += nums[i];
        }

        return -1;
    }
}