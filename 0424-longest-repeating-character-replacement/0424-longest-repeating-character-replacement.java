class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int sol = 0;
        int[] freq = new int[26];
        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right)-'A']);
            while((right-left+1)-maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            sol = Math.max(sol, right-left+1);
        }
        return sol;
    }
}