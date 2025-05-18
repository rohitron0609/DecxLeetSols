class Solution {
    public int[] sumZero(int n) {
        int[] sol = new int[n];
        int counter = 0;
        if(n%2==0){
            for(int i = 1; i <= n/2; i++){
                sol[counter] = i;
                sol[counter+1] = 0-i;
                counter += 2;
            }
        }
        else {
            sol[0] = 0;
            counter = 1;
            for(int i = 1; i <= n/2; i++){
                sol[counter] = i;
                sol[counter+1] = 0-i;
                counter += 2;
            }
        }
        return sol;
    }
}