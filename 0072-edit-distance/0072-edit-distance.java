class Solution {
    public int Ds(int i,int j,String word1,String word2,int dp[][]){
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int insert=Integer.MAX_VALUE;
        int delete=Integer.MAX_VALUE;
        int replace=Integer.MAX_VALUE;
        if(word1.charAt(i)==word2.charAt(j)){
            return Ds(i-1,j-1,word1,word2,dp);
        }
        else{
            insert=1+Ds(i,j-1,word1,word2,dp);
            delete=1+Ds(i-1,j,word1,word2,dp);
            replace=1+Ds(i-1,j-1,word1,word2,dp);
        }
        return dp[i][j]=Math.min(insert,Math.min(delete,replace));
    }
    public int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()][word2.length()];
        for(int[] l:dp){
            Arrays.fill(l,-1);
        }
        return Ds(word1.length()-1,word2.length()-1,word1,word2,dp);
    }
}