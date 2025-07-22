class Solution {
    public int countWords(String[] words1, String[] words2) {
        LinkedHashSet<String>st=new LinkedHashSet<>();
        HashMap<String,Integer>mp1=new HashMap<>();
        HashMap<String,Integer>mp2=new HashMap<>();
        for(int i=0;i<words1.length;i++){
            st.add(words1[i]);
        }
        for(int i=0;i<words2.length;i++){
            st.add(words2[i]);
        }
        for(int i=0;i<words1.length;i++){
            mp1.put(words1[i],mp1.getOrDefault(words1[i],0)+1);
        }
        for(int i=0;i<words2.length;i++){
            mp2.put(words2[i],mp2.getOrDefault(words2[i],0)+1);
        }
        int cnt=0;
        for(String w:st){
            if(mp1.containsKey(w) && mp2.containsKey(w)){
                if(mp1.get(w)==1 && mp2.get(w)==1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}