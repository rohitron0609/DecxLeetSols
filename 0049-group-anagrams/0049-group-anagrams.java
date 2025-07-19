class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> sol = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        for(String s : strs){
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String key = new String(str);
            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(s);
        }
        sol.addAll(mp.values());
        return sol;
    }
    
}