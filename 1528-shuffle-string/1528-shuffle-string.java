class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder st=new StringBuilder(s);
        for(int i=0;i<indices.length;i++){
            st.setCharAt(indices[i],s.charAt(i));
        }
        return st.toString();
    }
}