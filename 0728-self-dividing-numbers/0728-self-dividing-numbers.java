class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> sol = new ArrayList<>();
        for( int i = left; i <= right; i++){
            if(isSelfDividing(i)){
                sol.add(i);
            }
        }
        return sol;
    }

    boolean isSelfDividing(int temp){
        int a = temp;
        while( a != 0){
            int b = a % 10;
            if((b == 0) || (temp % b) != 0) return false;
            a = a/10;
        }
        return true;
    }
}