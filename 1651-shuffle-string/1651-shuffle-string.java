class Solution {
    public String restoreString(String s, int[] indices) {
        TreeMap<Integer,Character>mp=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(indices[i],s.charAt(i)); 
        }
        StringBuilder st=new StringBuilder();
        for(Map.Entry<Integer,Character>b:mp.entrySet()){
            st.append(b.getValue());
        }
        return st.toString();
    }
}