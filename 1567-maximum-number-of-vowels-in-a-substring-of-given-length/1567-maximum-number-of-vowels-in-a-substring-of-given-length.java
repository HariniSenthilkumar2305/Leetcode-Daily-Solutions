class Solution {

    public int maxVowels(String s, int k) {
        int n=s.length();
        int r=0;
        int l=0;
        int max_vow=Integer.MIN_VALUE;
        int curr_vow=0;
        while(r<=n-1){
        if(isvowel(s.charAt(r))){
            curr_vow++;
        }
         if(r-l+1<k)
         {
            r++;
          }
          else if(r-l+1==k)
          {
          max_vow=Math.max(max_vow,curr_vow);
          if(isvowel(s.charAt(l))){
            curr_vow--;
           }
           l++;
           r++;
        }
    }
    return max_vow;
    }
     private boolean isvowel(char c) {
        c = Character.toLowerCase(c); 
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}