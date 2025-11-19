class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=word.indexOf(ch);
        String strtorev=word.substring(0,idx+1);
        StringBuilder st=new StringBuilder(strtorev);
        String val=st.reverse().toString();
        String s=word.substring(idx+1,word.length());
        return val+s;
    }
}