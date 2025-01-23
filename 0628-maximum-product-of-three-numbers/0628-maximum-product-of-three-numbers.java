class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length<0){
            return 0;
        }
        Arrays.sort(nums);
        int option1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int option2=nums[0]*nums[1]*nums[nums.length-1];   
        return Math.max(option1,option2);
    }
}