class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i;
        int min=1;
        int max=0;
        for(i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int ans=0;
        while(min<=max){
            int mid=(min+max)/2;
            if(amiabletofinish(mid,piles,h)){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
    public static boolean amiabletofinish(int mid,int piles[],int h){
        int i;
        long timetaken=0;
        for(i=0;i<piles.length;i++){
            timetaken+=piles[i]/mid;
            if(piles[i]%mid!=0){
               timetaken+=1;
            }
        }
        if(timetaken<=h){
            return true;
        }
        else{
            return false;
        }
    }
}