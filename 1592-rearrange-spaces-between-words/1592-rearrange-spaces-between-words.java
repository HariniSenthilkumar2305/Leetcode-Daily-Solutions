class Solution {
    public String reorderSpaces(String text) {
        String[] t=text.trim().split("\\s+");
        int l=t.length;
        int nt=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                nt++;
            }
        }
        if(l==1){
            StringBuilder st=new StringBuilder(t[0]);
            for(int i=0;i<nt;i++){
                st.append(" ");
            }
            return st.toString();
        }
        int q=nt/(l-1);
        int r=nt%(l-1);
        StringBuilder s=new StringBuilder();
        for(int i=0;i<t.length;i++){
            s.append(t[i]);
            if(i<l-1){
                for(int j=0;j<q;j++){
                    s.append(" ");
                }
            }
        }
            for(int i=0;i<r;i++){
                s.append(" ");
            }
        return s.toString();
    }
}