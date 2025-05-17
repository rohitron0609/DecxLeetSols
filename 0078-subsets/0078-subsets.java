class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sol= new ArrayList<>();
        helper(nums, sol, 0, new ArrayList<>());
        return sol;
    }
    void helper(int[] nums, List<List<Integer>> sol,int pos, List<Integer> temp){
        sol.add(new ArrayList<>(temp));
        for(int i = pos; i < nums.length; i++){
            temp.add(nums[i]);
            helper(nums, sol, i+1, temp);
            temp.remove(temp.size()-1);
        }
    }
}