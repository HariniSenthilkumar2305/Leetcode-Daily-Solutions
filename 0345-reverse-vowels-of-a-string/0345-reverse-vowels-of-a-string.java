class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        StringBuilder st=new StringBuilder(s);
        while(l<=r){
            if(isvowel(st.charAt(l)) && isvowel(st.charAt(r))){
                    char temp=st.charAt(l);
                    st.setCharAt(l,st.charAt(r));
                    st.setCharAt(r,temp);
                    l++;
                    r--;
            }
            else{
                if(!isvowel(st.charAt(l))){
                    l++;
                }
                else if(!isvowel(st.charAt(r))){
                    r--;
                }
            }
        }
        return st.toString();
    }
    public boolean isvowel(char c){
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}