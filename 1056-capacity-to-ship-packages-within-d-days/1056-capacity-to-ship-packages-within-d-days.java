class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min=0;
        int max=0;
        for(int i=0;i<weights.length;i++){
            max+=weights[i];
        if(weights[i]>min){
           min=weights[i];
        }
        }
        int ans=0;
        while(min<=max){
            int mid=(min+max)/2;
            if(possibletoship(mid,weights,days)){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
    boolean possibletoship(int capacity,int weights[],int days){
        int daystaken=1;
        int currentload=0;
        for(int i=0;i<weights.length;i++){
            currentload+=weights[i];
            if(currentload>capacity){
                daystaken+=1;
                currentload=weights[i];
            }
        }
        if(daystaken<=days){
            return true;
        }
        else{
            return false;
        }
    }
}