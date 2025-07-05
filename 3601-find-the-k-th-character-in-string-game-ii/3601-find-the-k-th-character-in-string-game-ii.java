class Solution {
    public char kthCharacter(long k, int[] operations) {
        if(k==1){
            return 'a';
        }
           long l=1;
           int i=0;
           for(;i<operations.length;i++){
            l*=2;
            if(l>=k)break;
           }
          char ch=kthCharacter(k-l/2,operations);
          if(operations[i]==0){
            return ch;
          }
          else{
            if(ch=='z')return 'a';
            else{
                return (char)(ch+1);
            }
          }
    }
}