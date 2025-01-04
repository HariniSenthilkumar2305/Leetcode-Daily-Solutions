class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int i,j;
        for(i=0;i<numbers.length-1;i++){
            for(j=i+1;j<numbers.length;j++){
                if((numbers[i]+numbers[j])==target){
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }
                else{
                    continue;
                }
            }
        }
        return result;
    }
}