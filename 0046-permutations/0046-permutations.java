class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(nums, sol, temp);
        return sol;
    }
    void helper(int[] nums, List<List<Integer>> sol, List<Integer> temp){
        if(temp.size() == nums.length){
            sol.add(new ArrayList<>(temp));
        }
        for(int i = 0; i < nums.length; i++){
            if(temp.contains(nums[i]))
                continue;
            temp.add(nums[i]);
            helper(nums, sol, temp);
            temp.remove(temp.size()-1);
        }
    }
}