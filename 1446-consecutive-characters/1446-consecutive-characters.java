class Solution {
    public int maxPower(String s) {
        int maxlen=1;
        ArrayList<String>a=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int cnt=1;
            for(int j=i+1;j<s.length();j++){
               if(s.charAt(i)==s.charAt(j)){
                cnt++;
               }
               else{
                break;
               }
            }
            maxlen=Math.max(cnt,maxlen);
        }
        return maxlen;
    }
}