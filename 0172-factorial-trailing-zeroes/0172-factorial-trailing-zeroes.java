class Solution {
    public int trailingZeroes(int n) {
        int count = 2 * (n/10);
        int temp = n - 10*(n/10);
        if(temp >= 5) count++;
        return count+n/25;    
    }
}