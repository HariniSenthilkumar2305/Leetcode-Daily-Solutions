class Solution {
    public char kthCharacter(int k) {
        int i=0;
        String wordtostrt="a";
        StringBuilder word=new StringBuilder(wordtostrt);
        while(word.length()<k){
            int len=word.length();
            for(int l=0;l<len && word.length()<k;l++){
                word.append((char)(word.charAt(l)+1));
            }
        }
        String res=word.toString();
        return res.charAt(k-1);
    }
} 