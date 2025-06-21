class Solution {
    public int longestValidParentheses(String s) {
        int c = 0, o = 0;  
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                o++;
            }
            else {
                c++;
            }
            if(o == c){
                ans = Math.max(ans, o+c);
            }
            else if(c > o){
                o = 0;
                c = 0;
            }
        }
        c = 0;
        o = 0;
        for(int i = s.length()-1; i >=0; i--){
            if(s.charAt(i) == ')'){
                c++;
            }
            else{
                o++;
            }
            if(o > c){
                o = 0;
                c = 0;
            }
            if( o == c){
                ans = Math.max(ans, o+c);
            }
        }
        return ans;
    }
}