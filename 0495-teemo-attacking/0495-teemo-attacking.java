class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(duration==0 ||timeSeries.length==0){
            return 0;
        }
       int total=0;
       for(int i=0;i<timeSeries.length-1;i++){
        int diff=timeSeries[i+1]-timeSeries[i];
        total+=Math.min(diff,duration);
       }
       total+=duration;
       return total;
    }
}