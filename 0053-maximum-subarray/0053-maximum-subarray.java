class Solution {
    public int maxSubArray(int[] nums) {
       int maxendhere=0;
       int maxsofar=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        maxendhere=Math.max(nums[i],maxendhere+nums[i]);
        if(maxsofar<maxendhere)
        {
            maxsofar=maxendhere;
        }
      }
      return maxsofar;
    }
}