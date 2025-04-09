class Solution {
    public int[] sortArrayByParityII(int[] nums) {
      int i=0,j=1;
      while(true){
        while(i<nums.length && nums[i]%2==0) i+=2;
        while(j<nums.length && nums[j]%2==1)j+=2;
        if(i>nums.length || j>nums.length)break;
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i+=2;
        j+=2;
      }
      return nums;  
    }
}