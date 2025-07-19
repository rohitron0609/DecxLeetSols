class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> sol = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String s = freqMap(strs[i]);
            mp.putIfAbsent(s, new ArrayList<>());
            mp.get(s).add(strs[i]);
        }
        sol.addAll(mp.values());
        return sol;
    }
    String freqMap(String s){
        int[] freqMap = new int[26];
        for(int i = 0; i < s.length(); i++){
            freqMap[s.charAt(i)-'a']++;
        }
        return Arrays.toString(freqMap);
    }
}