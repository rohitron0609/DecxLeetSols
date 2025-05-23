class Solution {
    public int totalHammingDistance(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < 32; i++){
            int countOnes = 0;
            for(int num : nums){
                if((num >> i&1) == 1)
                countOnes++;
            }
            count += countOnes * (n-countOnes);
        }
        return count;
    }
}