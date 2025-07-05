class Solution {
    public int longestPalindrome(String s) {
        int[] cnt=new int[126];
        for(char c:s.toCharArray()){
            cnt[c]++;
        }
        boolean hasodd=false;
        int len=0;
        for(int i=0;i<126;i++){
            if(cnt[i]%2==0){
                len+=cnt[i];
            }
            else{
                len+=cnt[i]-1;
                hasodd=true;
            }
        }
        if(hasodd)len+=1;
        return len;
    }
}