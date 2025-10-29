class Solution {
    public boolean checkIfExist(int[] arr) {
      for(int i=0;i<arr.length-1;i++){
        boolean pre=false;
        int val=arr[i];
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]*2==val || val*2==arr[j]){
                pre=true;
                break;
            }
        }
        if(pre){
            return true;
        }
      }
      return false;  
    }
}