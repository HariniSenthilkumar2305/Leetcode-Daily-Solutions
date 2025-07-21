class Solution {
    public String makeGood(String s) {
        StringBuilder st=new StringBuilder(s);
        for(int i=0;i<st.length()-1;i++){
            if(Character.isLowerCase(st.charAt(i)) && Character.isUpperCase(st.charAt(i+1))){
                if(st.charAt(i)==Character.toLowerCase(st.charAt(i+1))){
                    st.deleteCharAt(i);
                    st.deleteCharAt(i);
                    i=Math.max(-1,i-2);           
                }
            }
            else  if(Character.isUpperCase(st.charAt(i)) && Character.isLowerCase(st.charAt(i+1))){
                if(st.charAt(i)==Character.toUpperCase(st.charAt(i+1))){
                    st.deleteCharAt(i);
                    st.deleteCharAt(i);
                    i=Math.max(-1,i-2);           
                }
            }
        }
        return st.toString();
    }
}