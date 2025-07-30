class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sol = 0;
        for(String s : operations){
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(2 * st.peek());
            }
            else if(s.equals("+")){
                int top = st.pop();
                int added = st.peek()+top;
                st.push(top);
                st.push(added);
            }
            else st.push(Integer.parseInt(s));
        }
        for(int val : st){
            sol += val;
        }
        return sol;
    }
}