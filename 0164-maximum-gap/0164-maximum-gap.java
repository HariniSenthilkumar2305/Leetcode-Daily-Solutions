class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int maxdiff=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]>maxdiff){
                maxdiff=nums[i]-nums[i-1];
            }
        }
        return maxdiff;
    }
}