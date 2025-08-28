class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character>hs=new HashSet<>();
        HashSet<Character>hs1=new HashSet<>();
        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                hs.add(word.charAt(i));
            }
        }
        int cnt=0;
         for(int i=0;i<word.length();i++){
            hs1.add(word.charAt(i));
         }
         for(char c:hs){
            if(hs1.contains(Character.toUpperCase(c))){
                cnt++;
            }
         }
         return cnt;
    }
}