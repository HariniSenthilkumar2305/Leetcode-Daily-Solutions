class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        List<Integer>result=new ArrayList<>();
        int currsum=0;
        for(int i=nums.length-1;i>=0;i--){
           result.add(nums[i]);
           currsum=currsum+nums[i];
            if(currsum>totalsum-currsum){
                break;
            }
        }
        return result;
    }
}