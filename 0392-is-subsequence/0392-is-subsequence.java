class Solution {
    public boolean isSubsequence(String s, String t) {
        int k=0;
        if(s.length()==1 && t.length()==1){
            if(s.charAt(0)!=t.charAt(0)){
                return false;
            }
            else{
                return true;
            }
        }
        if(t.length()==0 && s.length()==0){
            return true;
        }
        else if(t.length()==0){
            return false;
        }
        else{
            for(int i=0;i<s.length();i++){
                boolean found=false;
              for(int j=k;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    k=j+1;
                    found=true;
                    break;
                }
              }
            if(!found){
                return false;
            }
            }
         }
       return true;
    }
}