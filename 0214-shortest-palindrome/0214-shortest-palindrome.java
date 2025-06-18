class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder a=new StringBuilder(s);
        StringBuilder res=new StringBuilder(s);
        String rev=a.reverse().toString();
        String val="";
        for(int i=0;i<rev.length();i++){
         String suffix=rev.substring(i);
         if(s.startsWith(suffix)){
           String toadd=rev.substring(0,i);
           val=toadd+s;
           break;
         }
        }
        return val;
}
}