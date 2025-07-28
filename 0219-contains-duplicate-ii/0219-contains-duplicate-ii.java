class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int s = nums.length;
        for(int i = 0; i < s-1; i++){
            for(int j = i+1; j <= i+k && j < s; j++){
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}