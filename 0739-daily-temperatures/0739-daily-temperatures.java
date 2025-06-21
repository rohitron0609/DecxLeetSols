class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] sol = new int[n];
        for(int i = n-1; i >= 0; i--){
            while(!st.empty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }
            int v = (st.empty())? 0 : st.peek()-i;
            sol[i] = v;
            st.push(i);
        }
        return sol;
    }
}