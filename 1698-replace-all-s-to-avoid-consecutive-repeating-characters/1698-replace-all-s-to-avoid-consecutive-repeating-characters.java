class Solution {
    public boolean isconcecutive(char a,char b){
        return Math.abs(a-b)==1 || a==b;
    }
    public String modifyString(String s) {
        StringBuilder st=new StringBuilder(s);
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='?'){
                for(char ch='a';ch<='z';ch++){
                    boolean nonconceprev=(i==0 || !isconcecutive(st.charAt(i-1),ch));
                    boolean nonconcenext=(i==st.length()-1 || !isconcecutive(st.charAt(i+1),ch));
                    if(nonconceprev && nonconcenext){
                        st.setCharAt(i,ch);
                        break;
                    }
                }
            }
        }
        return st.toString();
    }
}