class Solution {
    public int minDeletionSize(String[] strs) {
        int length=strs[0].length()-1;
        int k=0;
        boolean val=true;
        int cnt=0;
        while(k<=length){
        for(int i=0;i<strs.length-1;i++){
            int prev=strs[i].charAt(k)-'a';
                if(prev<=strs[i+1].charAt(k)-'a'){
                    val=true;
                }
                else{
                    val=false;
                    break;
                }
            }
            if(!val){
                cnt++;
            }
            k++;
        }
        return cnt;
    }
}