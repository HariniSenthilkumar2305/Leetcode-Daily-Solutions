class Solution {
    public String makeFancyString(String s) {
       StringBuilder st=new StringBuilder(s);
       for(int i=1;i<st.length()-1;i++){
        if(st.charAt(i)==st.charAt(i-1) && st.charAt(i)==st.charAt(i+1)){
            st.deleteCharAt(i);
            i=Math.max(-1,i-1);
        }
       }
       return st.toString(); 
    }
}