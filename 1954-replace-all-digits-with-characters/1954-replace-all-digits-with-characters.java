class Solution {
    public String replaceDigits(String s) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2!=0){
                int asciiofchar=((int)s.charAt(i-1))+(s.charAt(i)-'0');
                char ch=(char)asciiofchar;
                st.append(ch);
            }
            else{
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}