class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int n=0;
       for(int i=0;i<=n;i++){
       n=Math.max(n,i+nums[i]);
       if(n>=nums.length-1){
        return true;
       }
       }
       return false;
    }
}