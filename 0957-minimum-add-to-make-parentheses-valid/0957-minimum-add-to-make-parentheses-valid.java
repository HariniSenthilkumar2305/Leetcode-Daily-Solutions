class Solution {
    public int minAddToMakeValid(String s) {
      int leftbalance=0;
      int rightbalance=0;
    for(char ch:s.toCharArray()){
        if(ch=='('){
            leftbalance++;
        }
        else{
            if(leftbalance>0){
                leftbalance--;
            }
            else{
                rightbalance++;
            }
        }
    }
    return leftbalance+rightbalance;
    }
}