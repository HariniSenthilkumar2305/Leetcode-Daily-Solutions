class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int sum=right;
        while(right>left){
            right=right&(right-1);
        }
        return right;
    }
}