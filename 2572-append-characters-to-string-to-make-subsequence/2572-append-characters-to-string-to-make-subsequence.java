class Solution {
    public int appendCharacters(String s, String t) {
     int l=0;
     int r=0;
     while(l<s.length() && r<t.length()){
        if(s.charAt(l)==t.charAt(r)){
         r++;
        }
         l++;
     }
    
     return t.length()-r;
    }
}