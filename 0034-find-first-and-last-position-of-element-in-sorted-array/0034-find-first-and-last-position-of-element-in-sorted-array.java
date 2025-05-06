class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = findLeftPos(nums, target);
        int right = findRightPos(nums, target);
        return new int[] {left, right};
    }

    public int findLeftPos(int[] nums, int target){
        int left = 0, right = nums.length-1, sol = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                sol = mid;
                right = mid-1;
            }else if(nums[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return sol;
    }

    public int findRightPos(int[] nums, int target){
        int left = 0, right = nums.length-1, sol = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                sol = mid;
                left = mid+1;
            }else if(nums[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return sol;
    }
}