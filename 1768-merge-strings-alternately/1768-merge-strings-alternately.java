class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int n1 = 0;
        int n2 = 0;
        while(n1 < word1.length() || n2 < word2.length()){
            if(n1 < word1.length()){
                result.append(word1.charAt(n1));
                n1++;
            }
            if(n2 < word2.length()){
                result.append(word2.charAt(n2));
                n2++;
            }
        }

        return result.toString();
    }
}