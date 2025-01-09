class Solution {
    public int rob(int[] nums) {
      if(nums==null || nums.length==0){
        return 0;
      }
      if(nums.length==1){
        return nums[0];
      }
      int prevmax=0;
      int currmax=0;
      for(int i=0;i<nums.length;i++){
        int newmax=Math.max(currmax,prevmax+nums[i]);
        prevmax=currmax;
        currmax=newmax;
      }
      return currmax;
    }
}