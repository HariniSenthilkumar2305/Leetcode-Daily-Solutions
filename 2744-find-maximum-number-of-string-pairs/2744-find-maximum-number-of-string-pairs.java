class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int cnt=0;        
        for(int i=0;i<words.length-1;i++){
            String w=words[i];
            for(int j=i+1;j<words.length;j++){
                String w1=words[j];
                StringBuilder s=new StringBuilder(w1).reverse();
                String st=s.toString();
                if(st.equals(w)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}