class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int cnt=0;
        for(int i=0;i<words.length-1;i++){
            String val1=words[i];
            for(int j=i+1;j<words.length;j++){
                StringBuilder st=new StringBuilder(words[j]);
                String val2=st.reverse().toString();
                if(val1.equals(val2)){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}