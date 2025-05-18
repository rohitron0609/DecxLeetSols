class Solution {
    public List<List<Integer>> subsets(int[] nums) {
           List<List<Integer>> sol = new ArrayList<>();
           List<Integer> temp = new ArrayList<>();
           helper(nums, sol, 0, temp);
           return sol;
    }
    private void helper(int[] nums,List<List<Integer>> sol, int index, List<Integer> temp){
        sol.add(new ArrayList<>(temp));
        for(int i = index; i < nums.length; i++){
            temp.add(nums[i]);
            helper(nums, sol, i+1, temp);
            temp.remove(temp.size()-1);
        }
    }
}