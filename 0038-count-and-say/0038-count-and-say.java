class Solution {
    public String countAndSay(int n) {
      String result="1";
      for(int i=2;i<=n;i++){
        result=nextSequence(result);
      } 
        return result;
    }
    public static String nextSequence(String s){
        StringBuilder nextSeq=new StringBuilder();
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
            nextSeq.append(count).append(s.charAt(i-1));
            count=1;
            }
        }
nextSeq.append(count).append(s.charAt(s.length()-1));
return nextSeq.toString();
     }
}