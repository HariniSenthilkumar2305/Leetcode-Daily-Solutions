class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        boolean val=false;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%3!=0){
            return false;
        }
        int target=sum/3;
        int count=0;
        int currentsum=0;
        for(int i=0;i<arr.length;i++){
            currentsum+=arr[i];
            if(currentsum==target){
                if(count==2) return true;
                
            count++;
            currentsum=0;
            }
        }
        return false;
    }
}