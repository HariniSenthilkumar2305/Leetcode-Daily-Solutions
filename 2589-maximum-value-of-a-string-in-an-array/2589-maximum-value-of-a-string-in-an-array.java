class Solution {
    public int maximumValue(String[] strs) {
        int[] arr=new int[strs.length];
        for(int i=0;i<strs.length;i++){
            boolean isdi=true;
            for(int j=0;j<strs[i].length();j++){
                if(!Character.isDigit(strs[i].charAt(j))){
                    isdi=false;
                    break;
                }
            }
            if(!isdi){
                arr[i]=strs[i].length();
            }
            else{
                int val=Integer.parseInt(strs[i],10);
                arr[i]=val;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}