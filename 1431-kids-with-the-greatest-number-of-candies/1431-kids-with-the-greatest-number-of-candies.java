class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int mostCandies = 0;
        for(int i : candies){
            if(i > mostCandies)
                mostCandies = i;
        }
        List<Boolean> sol = new ArrayList<>();
        for(int i : candies){
            if(i+extraCandies >= mostCandies)
                sol.add(true);
            else sol.add(false);
        }
        return sol;        
    }
}