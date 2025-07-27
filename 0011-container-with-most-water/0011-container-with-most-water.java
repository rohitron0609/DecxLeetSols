class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int vol = 0;
        while(left < right){
            int ht = Math.min(height[left], height[right]);
            int width = right - left;
            int currVol = ht * width;
            vol = Math.max(vol, currVol);
            if(height[left] < height[right])
                left++;
            else right--;
        }
        return vol;
    }
}