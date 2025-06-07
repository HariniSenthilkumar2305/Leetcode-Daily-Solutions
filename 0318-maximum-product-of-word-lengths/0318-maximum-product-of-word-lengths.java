class Solution {
    public int maxProduct(String[] words) {
        int n=words.length;
        int[] bitmask=new int[n];
        int[] len=new int[n];
        for(int i=0;i<n;i++){
            int mask=0;
            for(char ch:words[i].toCharArray()){
                mask|=1<<(ch-'a');
            }
            bitmask[i]=mask;
            len[i]=words[i].length();
        }
        int maxlen=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if((bitmask[i] & bitmask[j])==0){
                    maxlen=Math.max(len[i]*len[j],maxlen);
                }
            }
        }
        return maxlen;
    }
}