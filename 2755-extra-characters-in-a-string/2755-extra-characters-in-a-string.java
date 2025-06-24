class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String>dic=new HashSet<>();
        for(int i=0;i<dictionary.length;i++){
            dic.add(dictionary[i]);
        }
        int n=s.length();
       int[]dp=new int[n+1];
       dp[n]=0;
       for(int i=n-1;i>=0;i--){
        dp[i]=1+dp[i+1];
        for(int j=i+1;j<=n;j++){
            String substr=s.substring(i,j);
            if(dic.contains(substr)){
                dp[i]=Math.min(dp[i],dp[j]);
            }
        }
       }
       return dp[0];
    }
}