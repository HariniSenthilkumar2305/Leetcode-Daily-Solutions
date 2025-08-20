class Solution {
    public boolean vowelsubstr(String w){
        String vow="aeiou";
        for(int i=0;i<w.length();i++){
          if(vow.indexOf(w.charAt(i))==-1){
            return false;
          }
        }
        for(int i=0;i<vow.length();i++){
           if(w.indexOf(vow.charAt(i))==-1){
            return false;
           }
        }
        return true;
    }
    public int countVowelSubstrings(String word) {
        int cnt=0;
        for(int i=0;i<word.length();i++){
            for(int j=i;j<word.length();j++){
                String vowwrd=word.substring(i,j+1);
                if(vowelsubstr(vowwrd)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}