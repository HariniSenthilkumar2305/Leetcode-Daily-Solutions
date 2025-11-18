class Solution {
    public int buyChoco(int[] prices, int money) {
    int minsum=Integer.MAX_VALUE;
     for(int i=0;i<prices.length-1;i++){
        for(int j=i+1;j<prices.length;j++){
            minsum=Math.min(minsum,prices[i]+prices[j]);
        }
     }
     if(minsum<=money){
        return money-minsum;
     }
     return money;   
    }
}