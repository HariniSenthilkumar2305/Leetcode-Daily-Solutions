class Solution {
    public int specialArray(int[] nums) {
        int size=nums.length;
        for(int i=0;i<=size;i++){
            int val=i;
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=i){
                    cnt++;
                }
            }
            if(cnt==i){
                return cnt;
            }
        }
        return -1;
    }
}