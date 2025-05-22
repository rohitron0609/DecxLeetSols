class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = leftMost(nums, target);
        int right = rightMost(nums, target);
        return new int[]{left,right};
    }
    int leftMost(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int sol = -1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                sol = mid;
                r = mid-1;
            }
            if(nums[mid] < target){
                l = mid+1;
            }
            if(nums[mid] > target){
                r = mid-1;
            }
        }
        return sol;
    }
    int rightMost(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int sol = -1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                sol = mid;
                l = mid+1;
            }
            if(nums[mid] < target){
                l = mid+1;
            }
            if(nums[mid] > target){
                r = mid-1;
            }
        }
        return sol;
    }
}