class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        int[] sol = new int[2];
        for(int i = 0; i < n; i++){
            if(mp.containsKey(target-nums[i])){
                sol[0] = i;
                sol[1] = mp.get(target-nums[i]);
            }
            else{
                mp.put(nums[i], i);
            }
        }
        return sol;
    }
}