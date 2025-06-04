class Solution {
    public boolean repeatedSubstringPattern(String s) {
      int n=s.length();
      for(int i=n/2;i>0;i--){
        if(n%i!=0)continue;
        String val=s.substring(0,i);
        int repeatcnt=n/i;
        StringBuilder a=new StringBuilder();
        for(int j=0;j<repeatcnt;j++){
            a.append(val);
        }
        String res=a.toString();
        if(res.equals(s)){
            return true;
        }
      }
      return false;
    }
}
