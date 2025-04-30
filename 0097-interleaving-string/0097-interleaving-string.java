class Solution {
    public boolean interleaving(int i,int j,int k,String s1,String s2,String s3,Boolean[][][] dp){
        if(k==s3.length()) return (i == s1.length() && j == s2.length());

        if(dp[i][j][k]!=null) return dp[i][j][k];
        
        boolean ans=false;

        if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
            ans=ans || interleaving(i+1,j,k+1,s1,s2,s3,dp);
        }
        if(j<s2.length() && s2.charAt(j)==s3.charAt(k)){
            ans= ans || interleaving(i,j+1,k+1,s1,s2,s3,dp);
        }
        return dp[i][j][k]= ans;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        int n=s1.length();
        int m=s2.length();
        int o=s3.length();
        Boolean[][][] dp=new Boolean[n+1][m+1][o+1];
        return interleaving(0,0,0,s1,s2,s3,dp);
        
    }
}