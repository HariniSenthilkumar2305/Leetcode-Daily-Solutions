class Solution {
    public int[] decrypt(int[] code, int k) {
        int N=code.length;
        int[] res=new int[code.length];
        if(k>0){
            for(int i=0;i<code.length;i++){
                int sum=0;
                int cnt=1;
                while(cnt<=k){
                    int newidx=(i+cnt)%N;
                    sum+=code[newidx];
                    cnt++;
                }
                res[i]=sum;
            }
        }
        else if(k<0){
                k=-k;
                for(int i=0;i<code.length;i++){
                int sum=0;
                int cnt=1;
                while(cnt<=k){
                    int newidx=(i-cnt+N)%N;
                    sum+=code[newidx];
                    cnt++;
                }
                res[i]=sum;
            }
        }
        else if(k==0){
            for(int i=0;i<code.length;i++){
              res[i]=0;  
            }
        }
        return res;
    }
}