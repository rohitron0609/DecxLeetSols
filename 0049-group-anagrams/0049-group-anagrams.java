class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> sol = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        for(String s : strs){
            int[] temp = createFreq(s);
            String t = Arrays.toString(temp);
            mp.putIfAbsent(t, new ArrayList<>());
            mp.get(t).add(s);
        }
        sol.addAll(mp.values());
        return sol;
    }

    int[] createFreq(String s){
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        return freq;
    }
}