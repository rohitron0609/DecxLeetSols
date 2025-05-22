class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x;
        while(l <= r){
            int mid = l + (r - l)/2;
            long curr = (long)mid*mid;
            if(curr == x) return mid;
            if(curr < x)
                l = mid+1;
            if(curr > x)
                r = mid-1;
        }
        return r;
    }
}