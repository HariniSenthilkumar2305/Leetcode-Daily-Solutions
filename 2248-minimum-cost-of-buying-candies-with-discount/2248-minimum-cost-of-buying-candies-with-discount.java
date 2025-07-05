class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        Arrays.sort(cost);
        for(int i=0;i<n/2;i++){
            int temp;
            temp=cost[i];
            cost[i]=cost[n-i-1];
            cost[n-i-1]=temp;
        }
        int sum=0;
        for(int i=0;i<cost.length;i=i+3){
            sum+=cost[i];
            if(i+1<n){
                sum+=cost[i+1];
            }
        }
        return sum; 
    }
}