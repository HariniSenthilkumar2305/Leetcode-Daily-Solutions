class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestsum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                 int currentsum;
                currentsum=nums[i]+nums[left]+nums[right];
            if(Math.abs(currentsum-target)<Math.abs(closestsum-target)){
                closestsum=currentsum;
            }
            if(currentsum<target){
                left++;
            }
            else if(currentsum>target){
                right--;
            }
            else{
                return currentsum;
            }
        }
        }
        return closestsum;
}
}