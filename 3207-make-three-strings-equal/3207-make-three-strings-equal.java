class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
      int minlen=Math.min(s1.length(),Math.min(s2.length(),s3.length()));
      int cnt=0;
      for(int i=0;i<minlen;i++){
        if(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)){
            cnt++;
        }
        else{
            break;
        }
      }
      if(cnt==0)return -1;
      else return (s1.length()+s2.length()+s3.length())-3*cnt;
    }
}