class Solution {
    public String sortString(String s) {
        int[] ch=new int[26];
        for(char c:s.toCharArray()){
            ch[c-'a']++;
        }
        StringBuilder o=new StringBuilder();
        while(o.length()<s.length()){
            for(int i=0;i<26;i++){
                if(ch[i]!=0){
                    o.append((char)(i+'a'));
                    ch[i]--;
                }
            }
            for(int i=25;i>=0;i--){
                if(ch[i]!=0){
                    o.append((char)(i+'a'));
                    ch[i]--;
                }
            }
        }
        return o.toString();
    }
}