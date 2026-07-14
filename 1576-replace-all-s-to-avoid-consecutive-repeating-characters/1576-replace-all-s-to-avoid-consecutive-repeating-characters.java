class Solution {
    public String modifyString(String s) {
        ArrayList<Character>a=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='?'){
                a.add(s.charAt(i));
            }
        }
        StringBuilder st=new StringBuilder(s);
        ArrayList<Character>ch=new ArrayList<>();
        for(char c='a';c<='z';c++){
            ch.add(c);
        }
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='?'){
                for(int j=0;j<ch.size();j++){
                    if(i==0 || i==st.length()-1){
                        if(!a.contains(ch.get(j))){
                            st.setCharAt(i,ch.get(j));
                            a.add(ch.get(j));
                            break;
                        }
                    }
                    else{
                        if(st.charAt(i-1)!=ch.get(j) && st.charAt(i+1)!=ch.get(j)){
                            st.setCharAt(i,ch.get(j));
                        }
                    }
                }
            }
        }
        return st.toString();
    }
}