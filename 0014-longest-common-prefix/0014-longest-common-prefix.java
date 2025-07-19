class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s = strs[0];
        String t = strs[strs.length-1];
        String ans = "";
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == t.charAt(i))
                ans += s.charAt(i);
            else break;
        }
        return ans;
    }
}