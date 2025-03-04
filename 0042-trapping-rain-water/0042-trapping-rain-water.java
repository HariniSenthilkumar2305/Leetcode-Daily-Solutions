class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxleft=Integer.MIN_VALUE;
        int maxright=Integer.MIN_VALUE;
        int totaltrap=0;
            while(left<right){
                if(height[left]<=height[right]){
                      if(height[left]>=maxleft){
                        maxleft=height[left];
                     }
                    else{
                        totaltrap+=maxleft-height[left];
                    }
                    left++;
                }
                else{
                    if(height[right]>=maxright){
                         maxright=height[right];
                    }
                    else{
                        totaltrap+=maxright-height[right];
                     }
                     right--;
                }
            }
        return totaltrap;
    }
}