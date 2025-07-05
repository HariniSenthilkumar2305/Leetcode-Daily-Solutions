class Solution {
    public int findClosestNumber(int[] nums) {
     int clo=nums[0];
     for(int i=0;i<nums.length;i++){
        if(Math.abs(nums[i])<Math.abs(clo)){
            clo=nums[i];
        }
        else if(Math.abs(nums[i])==Math.abs(clo) && nums[i]>clo){
            clo=nums[i];
        }
     }
     return clo;
    }
}