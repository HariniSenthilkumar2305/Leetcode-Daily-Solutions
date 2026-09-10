class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        int res=0;
        boolean t=true;
        for(int i=0;i<=n;i++){
              int val=i;
              int cnt=0;
              for(int j=0;j<nums.length;j++){
                if(nums[j]>=val){
                    cnt++;
                }
              }
              if(cnt==val){
                res=val;
              }
        }
        if(res>0){
            return res;
        }
        return -1;
    }
}