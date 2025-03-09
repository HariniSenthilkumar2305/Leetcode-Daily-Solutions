class Solution {
    public int findNumbers(int[] nums) {
        int count1=0;
        int val=0;
        for(int i=0;i<nums.length;i++){
             int count=0;
            while(nums[i]>0){
                count++;
                val=nums[i]%10;
                nums[i]=nums[i]/10;
            }
            if(count%2==0){
                count1++;
            }
        }
        return count1;
    }
}