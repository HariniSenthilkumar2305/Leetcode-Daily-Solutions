class Solution {
    public boolean detectCapitalUse(String word) {
       int cntup=0;
       int cntlow=0;
       for(int i=0;i<word.length();i++){
        if(Character.isLowerCase(word.charAt(i))){
            cntlow++;
        }
        else if(Character.isUpperCase(word.charAt(i))){
            cntup++;
        }
       }
       if(cntup==word.length() || cntlow==word.length()){
        return true;
       }
       else if((cntup==1 && Character.isUpperCase(word.charAt(0))) && cntlow==word.length()-1){
        return true;
       }
       return false;
    }
}