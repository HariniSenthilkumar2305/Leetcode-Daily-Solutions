class Solution {
    public long sumDigitDifferences(int[] nums) {
       long res=0;
       int dg=(nums[0]+"").length();
       int n=nums.length;
       for(int j=0;j<dg;j++){
        int[] cnt=new int[10];
        for(int i=0;i<n;i++){
            int val=(nums[i]+"").charAt(j)-'0';
            cnt[val]++;
            res+=(i-cnt[val]+1);
        }
       }
       return res;
    }
}