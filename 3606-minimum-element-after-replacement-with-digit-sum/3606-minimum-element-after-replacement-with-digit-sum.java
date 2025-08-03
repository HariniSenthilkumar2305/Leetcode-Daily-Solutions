class Solution {
    public int minElement(int[] nums) {
        int[] sumofdi=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            int sum=0;
            while(val>0){
                sum+=val%10;
                val=val/10;
            }
            sumofdi[i]=sum;
        }
        int minval=Integer.MAX_VALUE;
        for(int i=0;i<sumofdi.length;i++){
            if(sumofdi[i]<minval){
                minval=sumofdi[i];
            }
        }
        return minval;
    }
}