class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1, l = nums.length;
        for(int i = 1; i < l; i++){
            if(nums[i] == nums[i-1])
                continue;
            else{
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}