class Solution {
    public int maxProductDifference(int[] nums) {
        int max=Integer.MIN_VALUE;
        int k=0;
        int l=0;
        int maxprod=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if((nums[i]*nums[j])>maxprod){
                        maxprod=nums[i]*nums[j];
                        k=i;
                        l=j;
                    }
                }
            }
        }
        int secmaxprod=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i!=k){
                for(int j=0;j<nums.length;j++){
                    if(i!=j){
                        if(j!=l){
                            secmaxprod=Math.min(secmaxprod,nums[i]*nums[j]);
                        }
                        else{
                            continue;
                        }
                    }
                    else{
                        continue;
                    }
                }
            }
            else{
                continue;
            }
        }
        return maxprod-secmaxprod;
    }
}