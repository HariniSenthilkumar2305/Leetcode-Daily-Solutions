class Solution {
    public int countElements(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            boolean strgrt=false;
            boolean strsma=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>ele){
                    strgrt=true;
                }
                if(nums[j]<ele){
                    strsma=true;
                }
            }
            if(strgrt && strsma){
                cnt++;
            }
        }
        return cnt;
    }
}