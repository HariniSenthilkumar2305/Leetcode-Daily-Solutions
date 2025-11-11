class Solution {
    public int mostWordsFound(String[] sentences) {
        int len=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String[] val=sentences[i].split(" ");
            len=Math.max(len,val.length);
        }
        return len;
    }
}