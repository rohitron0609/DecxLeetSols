class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] sol = new int[2];
        sol[0] = lowerBound(nums, target);
        sol[1] = upperBound(nums, target);
        return sol;
    }

    int lowerBound(int[] a, int target){
        int right = a.length-1;
        int left = 0;
        while(left < right){
            int mid = left + (right - left)/2;
            if(a[mid] < target)
                left = mid + 1;
            else right = mid;
        }
        return (left < a.length && a[left] == target) ? left : -1;
    }

    int upperBound(int[] a, int target){
        int right = a.length-1;
        int left = 0;
        while(left < right){
            int mid = left + (right - left + 1)/2;
            if(a[mid] > target)
                right = mid - 1;
            else left = mid;
        }
        return (left < a.length && a[left] == target) ? left : -1;
    }
}