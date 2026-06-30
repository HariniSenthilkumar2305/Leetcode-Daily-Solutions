class Solution {
    public int prefixCount(String[] words, String pref) {
        int len=pref.length();
        int cnt=0;
        for(int i=0;i<words.length;i++){
            if(words[i].length()>=len){
                String val=words[i].substring(0,len);
                if(val.equals(pref)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}