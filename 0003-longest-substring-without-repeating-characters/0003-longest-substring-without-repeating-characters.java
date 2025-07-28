class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sol = 0, left = 0;
        Set<Character> st = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            while(st.contains(s.charAt(right))){
                st.remove(s.charAt(left++));
            }
            st.add(s.charAt(right));
            sol = Math.max(sol, right-left+1);
        }
        return sol;
    }
}