class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int[] freqS1 = new int[26];
        int[] freqWindow = new int[26];

        if(l1 > l2) return false;
        for(int i = 0; i < l1; i++){
            freqS1[s1.charAt(i)-'a']++;
            freqWindow[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freqS1, freqWindow)) return true;

        for(int i = l1; i < l2; i++ ){
            freqWindow[s2.charAt(i)-'a']++;
            freqWindow[s2.charAt(i-l1)-'a']--;
            if(Arrays.equals(freqS1, freqWindow))
                return true;
        }
        return false;
    }
}