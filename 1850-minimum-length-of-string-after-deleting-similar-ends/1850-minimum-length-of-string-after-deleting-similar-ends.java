class Solution {
    public int minimumLength(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                break;
            }
            else{
                char ch=s.charAt(l);
                while(l<=r && s.charAt(l)==ch){
                    l++;
                }
                while(l<=r && s.charAt(r)==ch){
                    r--;
                }
            }
        }
        return r-l+1;
    }
}