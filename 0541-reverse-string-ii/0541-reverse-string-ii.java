class Solution {
    public String reverseStr(String s, int k) {
        String res="";
        for(int i=0;i<s.length();i+=2*k){
        int limit=Math.min(i+k,s.length());
        for(int j=0;j<limit-i;j++){
            res=res+s.charAt(limit-j-1);
        }
        for(int l=limit;l<Math.min(i+2*k,s.length());l++){
            res=res+s.charAt(l);
        }
        }
        return res;
    }
}