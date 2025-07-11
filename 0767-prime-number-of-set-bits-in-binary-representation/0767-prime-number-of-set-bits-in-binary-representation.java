class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt=0;
        for(int i=left;i<=right;i++){
         boolean isprime=true;
         int cntones=0;
         String strbin=Integer.toBinaryString(i);
          for(char ch:strbin.toCharArray()){
            if(ch=='1'){
                cntones++;
            }
          }
          if(cntones==1 || cntones==0){
            isprime=false;
          }
          else{
           for(int j=2;j<=cntones/2;j++){
                if(cntones%j==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            cnt++;
        } 
    }
    return cnt;
    }
}