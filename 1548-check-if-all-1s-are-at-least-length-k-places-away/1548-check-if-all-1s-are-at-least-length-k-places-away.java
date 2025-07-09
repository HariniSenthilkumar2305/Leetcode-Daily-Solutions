class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int l=0;
        int r=0;
        int i=0;
        while(i<nums.length){
            boolean val=false;
            if(nums[i]==1){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==1){
                        if(j-i-1<k){
                            return false;
                        }
                        else if(j-i-1>=k){
                            i=j-1;
                            val=true;
                            break;
                        }
                    }
                }
            }
            i++;
        }
        return true;
    }
}