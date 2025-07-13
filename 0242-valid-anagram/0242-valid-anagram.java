class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m)
            return false;
        int[] freq = new int[26];
        for(int i = 0; i < n; i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int i : freq){
            if(i != 0)
                return false;
        }

        return true;

    }
}