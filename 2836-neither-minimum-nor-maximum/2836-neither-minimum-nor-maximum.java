class Solution {
    public int findNonMinOrMax(int[] nums) {
        int minval=Integer.MAX_VALUE;
        int maxval=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            minval=Math.min(minval,nums[i]);
            maxval=Math.max(maxval,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=minval && nums[i]!=maxval){
                return nums[i];
            }
        }
        return -1;
    }
}