class Solution {
    public int maxProduct(int[] nums) {
      if(nums==null || nums.length==0){
        return 0;
      }
      int maxproduct=nums[0];
      int minproduct=nums[0];
      int result=nums[0];
      for(int i=1;i<nums.length;i++){
        if(nums[i]<0){
            int temp=maxproduct;
            maxproduct=minproduct;
            minproduct=temp;
        }
        maxproduct=Math.max(nums[i],maxproduct*nums[i]);
        minproduct=Math.min(nums[i],minproduct*nums[i]);
        result=Math.max(result,maxproduct);
      }
      return result;
    } 
}