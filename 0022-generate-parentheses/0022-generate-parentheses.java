class Solution {

    Stack<Character> stack = new Stack<>();
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
          backtrack(0,0,n);
          return res;
    }

    public void backtrack(int open, int close, int n){
        if(open == close && close == n){
            Iterator it = stack.iterator();
            String temp = "";
            while(it.hasNext()){
                temp += it.next();
            }
            res.add(temp);
        }
        if(open < n){
            stack.push('(');
            backtrack(open+1, close, n);
            stack.pop();
        }
        if(close < open){
            stack.push(')');
            backtrack(open,close+1,n);
            stack.pop();
        }
    }
}