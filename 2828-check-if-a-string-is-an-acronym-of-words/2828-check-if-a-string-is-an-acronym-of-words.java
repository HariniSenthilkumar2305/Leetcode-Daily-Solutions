class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<words.size();i++){
            String w=words.get(i);
            st.append(w.charAt(0));
        }
        String str=st.toString();
        if(str.equals(s)){
            return true;
        }
        return false;
    }
}