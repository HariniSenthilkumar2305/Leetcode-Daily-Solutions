class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        min=(max-k)-(min+k);
        return min<0?0:min;
    }
}