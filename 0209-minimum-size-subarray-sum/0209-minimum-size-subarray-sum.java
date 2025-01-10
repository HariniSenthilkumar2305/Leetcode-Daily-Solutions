class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int sum=0;
        int currleng=Integer.MAX_VALUE;
        while(r<=nums.length-1){
          if(nums[r]<=target || nums[r]>=target){
            sum=sum+nums[r];
            if(sum<target){
               r++;
            }
            else if(sum>=target){
              currleng=Math.min(currleng,r-l+1);
              l++;
              r=l;
              sum=0;
            }
          }
        }
       if(currleng!=Integer.MAX_VALUE){
         return currleng;
       }
       else{
        return 0;
       }
    }
}
