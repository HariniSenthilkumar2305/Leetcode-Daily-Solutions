class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                maxprod=Math.max(maxprod,((nums[i]-1)*(nums[j]-1)));
            }
        }
        return maxprod;
    }
}