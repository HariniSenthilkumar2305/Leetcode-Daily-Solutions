class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum=0;
        int sum1=0;
        if(start<destination){
            for(int i=start;i<destination;i++){//clockwise
                sum+=distance[i];
            }
            for(int j=start-1;j>=0;j--){//AntiClockwise
                sum1+=distance[j];
            }
            for(int j=distance.length-1;j>=destination;j--){
                sum1+=distance[j];
            }
        }
        else{
            for(int i=start;i<distance.length;i++){//Clockwise
                sum+=distance[i];
            }
            for(int j=0;j<destination;j++){
                sum+=distance[j];
            }
            for(int k=start-1;k>=destination;k--){//Anticlockwise
                sum1+=distance[k];
            }
        }
        return Math.min(sum1,sum);
    }
}