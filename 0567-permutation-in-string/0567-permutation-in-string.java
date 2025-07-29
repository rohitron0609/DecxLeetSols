class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if(l2 < l1) return false;
        int[] freqS1 = new int[26];
        for(int i = 0; i < l1; i++){
            freqS1[s1.charAt(i)-'a']++;
        }
        for(int i = 0; i <= l2-l1; i++){
            int[] temp = createMap(s2,i,i+l1);
            if(Arrays.equals(temp, freqS1))
                return true;
        }
        return false;
    }

    int[] createMap(String s,int a, int b){
        int[] freq = new int[26];
        for(int i = a; i < b; i++){
            freq[s.charAt(i)-'a']++;
        }
        return freq;
    }
}