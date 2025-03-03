class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
       int l=0;
       int maxlength=0;
       for(int r=1;r<nums.length;r++){
        if(nums[r]-nums[l]==1){
            maxlength=Math.max(maxlength,r-l+1);
        }
        else if(nums[r]-nums[l]>1){
            l++;
            r--;
        }
       }
       return maxlength;
    }
}