class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int smallest = 5000;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] < smallest) smallest = nums[mid];
            if(nums[right] < nums[mid])
                left = mid+1;
            else right = mid-1;
        }
        return smallest;
    }
}