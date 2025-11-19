class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str=new StringBuilder();
        int minlen=Math.min(word1.length(),word2.length());
        int maxlen=Math.max(word1.length(),word2.length());
        for(int i=0;i<minlen;i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        if(word2.length()>word1.length()){
            for(int i=minlen;i<maxlen;i++){
                str.append(word2.charAt(i));
            }
        }
        else{
             for(int i=minlen;i<maxlen;i++){
                str.append(word1.charAt(i));
            }
        }
        return str.toString();
    }
}