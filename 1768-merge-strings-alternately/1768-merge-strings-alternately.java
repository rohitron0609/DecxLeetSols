class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int size1 = word1.length();
        int size2 = word2.length();
        for(int i = 0; i < size1 || i < size2; i++){
            if(i < size1){
                sb.append(word1.charAt(i));
            }
            if(i < size2){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}