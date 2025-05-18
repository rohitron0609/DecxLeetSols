class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates, target, sol, 0, temp);
        return sol;
    }

    int sumOfTemp(List<Integer> temp){
        int tempSum = 0;
        for(int x : temp){
            tempSum += x;
        }
        return tempSum;
    }

    void helper(int[] nums, int target, List<List<Integer>> sol, int index, List<Integer> temp){
        if(sumOfTemp(temp) == target){
            sol.add(new ArrayList<>(temp));
            return;
        }
        if(sumOfTemp(temp) > target)
            return;

        for(int i = index; i < nums.length; i++){
            temp.add(nums[i]);
            helper(nums,target, sol,  i, temp);
            temp.remove(temp.size()-1);
        }
    }
}