class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if(amount[0]+amount[1]<amount[2]){
            return amount[2];
        }
        else{
            int total=amount[0]+amount[1]+amount[2];
            return (total+1)/2;
        }
    }
}