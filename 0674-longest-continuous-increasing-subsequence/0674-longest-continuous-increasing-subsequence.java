class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int fstele=nums[i];
            int k=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>fstele){
                     k=j;
                    fstele=nums[j];
                }
                else{
                    break;
                }
            }
            maxlen=Math.max(maxlen,k-i+1);
        }
        return maxlen;
    }
}