class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
            }
        }
        int[] arr=new int[cnt];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
               arr[idx++]=i;
            }
        }
        boolean val=true;
        for(int i=1;i<arr.length;i++){
                if((arr[i]-arr[i-1]-1)<k){
                    val=false;
                    return val;
                }
                else{
                    continue;
                }
        }
        return val;
    }
}