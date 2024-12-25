class Solution {
    public int maxProfit(int[] prices) {
        int sum=0;
        int l=0;
        int r=l+1;
        while(r<=prices.length-1 && l<=r){
          if(prices[r]>prices[l]){
            sum+=(prices[r]-prices[l]);
          }
          l++;
          r=l+1;
        }
        return sum;
    }
}