class Solution {
    public int[] countBits(int n) {
        int[]res=new int[n+1];
        for(int i=0;i<=n;i++){
            int count=0;
            String a=Integer.toBinaryString(i);
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)=='1'){
                    count++;
                }
            }
            res[i]=count; 
        }
        return res;
    }
}