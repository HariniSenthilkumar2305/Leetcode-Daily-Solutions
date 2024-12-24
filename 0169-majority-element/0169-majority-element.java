class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int n=nums.length;
        int element=0;
        boolean[] visited=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    visited[j]=true;
                    if(count>n/2){
                        element=nums[j];
                    }
                }
            }
        }
        return element;
    }
}