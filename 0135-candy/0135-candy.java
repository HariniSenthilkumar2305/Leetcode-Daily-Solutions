class Solution {
    public int candy(int[] ratings) {
        int i;
        int n=ratings.length;
        int sum=0;
        int[] candies=new int[ratings.length];
        for(i=0;i<candies.length;i++){
            candies[i]=1;
        }
        //left to right
        for(i=1;i<candies.length;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        //right to left
        for(i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        for(i=0;i<candies.length;i++){
            sum+=candies[i];
        }
        return sum;
    }
}