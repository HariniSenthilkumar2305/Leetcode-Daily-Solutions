class Solution {
    public int maximumUniqueSubarray(int[] nums) {
     int maxsum=0;
    HashSet<Integer>a=new HashSet<>();
    int sum=0;
    int left=0;
    int right=0;
        while(right<nums.length){
            while(a.contains(nums[right])){
                a.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            a.add(nums[right]);
            sum+=nums[right];
            maxsum=Math.max(sum,maxsum);
            right++;
        }
     return maxsum;
    }
}