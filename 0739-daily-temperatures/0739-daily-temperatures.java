class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] t = temperatures;
        int n = t.length;
        Stack<Integer> st = new Stack<>();
        int[] sol = new int[n];
        for(int i = n-1; i >= 0; i--){
            while(!st.empty() && t[st.peek()] <= t[i]){
                st.pop();
            }
            int v = (st.empty())? 0 : st.peek()-i;
            sol[i] = v;
            st.push(i);
        }
        return sol;
    }
}