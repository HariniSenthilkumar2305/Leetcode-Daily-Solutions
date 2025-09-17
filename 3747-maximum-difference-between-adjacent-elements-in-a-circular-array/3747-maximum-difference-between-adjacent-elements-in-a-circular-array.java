class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int startidx=0;
        int n=nums.length;
        int maxval=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int curridx=(startidx+i)%n;
            int nxtidx=(startidx+(i+1))%n;
            maxval=Math.max(maxval,Math.abs(nums[curridx]-nums[nxtidx]));
        }
        return maxval;
    }
}