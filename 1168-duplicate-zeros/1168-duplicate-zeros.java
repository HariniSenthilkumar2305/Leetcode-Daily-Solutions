class Solution {
    public void duplicateZeros(int[] arr) {
        int i=0;
        int j=0;
        int n=arr.length;
        int[] temp=new int[arr.length];
        while(j<n){
            if(arr[i]==0){
                temp[j]=arr[i];
                if(j+1<n){
                temp[j+1]=0;
                }
                i++;
                j+=2;
            }
            else{
                temp[j]=arr[i];
                i++;
                j++;
            }
        }
        for(int k=0;k<arr.length;k++){
            arr[k]=temp[k];
        }
    }
}