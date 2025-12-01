class Solution {
    public int countKeyChanges(String s) {
        String s1=s.toLowerCase();
        int cnt=0;
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i)!=s1.charAt(i+1)){
                cnt++;
            }
        }
        return cnt;
    }
}