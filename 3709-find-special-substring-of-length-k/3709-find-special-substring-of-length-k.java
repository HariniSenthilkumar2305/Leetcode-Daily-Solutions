class Solution {
    public boolean isdistinct(String a){
        HashSet<Character>st=new HashSet<>();
        for(int i=0;i<a.length();i++){
            st.add(a.charAt(i));
        }
        if(st.size()==1){
            return true;
        }
        return false;
    }
    public boolean hasSpecialSubstring(String s, int k) {
        if(s.length()==1 && k==1){
            return true;
        }
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String substr=s.substring(i,j+1);
                if(i==0){
                    if(substr.length()==k && isdistinct(substr) &&  (j+1==s.length() || s.charAt(j+1)!=s.charAt(j))){
                        return true;
                }
                }
                else if(j==s.length()-1){
                       if(substr.length()==k && isdistinct(substr) && s.charAt(i-1)!=s.charAt(i)){
                        return true;
                }
                }
                else{
                     if(substr.length()==k && isdistinct(substr) && s.charAt(i-1)!=s.charAt(i) && s.charAt(j+1)!=s.charAt(j)){
                        return true;
                }
                }
            }
        }
        return false;
    }
}