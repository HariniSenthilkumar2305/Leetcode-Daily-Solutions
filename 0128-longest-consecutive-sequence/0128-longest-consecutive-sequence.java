class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int maxlength=Integer.MIN_VALUE;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            else if(Math.abs(nums[i]-nums[i-1])==1){
                count++;
            }
            else{
                maxlength=Math.max(maxlength,count);
                count=1;
            }
        }
        maxlength=Math.max(maxlength,count);
        return maxlength;
    }
}