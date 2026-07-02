class Solution {
    public String longestNiceSubstring(String s) {
        int maxlen=Integer.MIN_VALUE;
        String res="";
        ArrayList<String>l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String substr=s.substring(i,j+1);
                l.add(substr);
            }
        }
        for(int i=0;i<l.size();i++){
            String st=l.get(i);
            boolean val=true;
            ArrayList<Character>up=new ArrayList<>();
            ArrayList<Character>lo=new ArrayList<>();
            for(int j=0;j<st.length();j++){
                if(Character.isUpperCase(st.charAt(j))){
                    up.add(st.charAt(j));
                }
                else if(Character.isLowerCase(st.charAt(j))){
                    lo.add(st.charAt(j));
                }
            }
            for(int k=0;k<up.size();k++){
                if(!lo.contains(Character.toLowerCase(up.get(k)))){
                    val=false;
                    break;
                }
            }
            if(val){
                for(int k=0;k<lo.size();k++){
                    if(!up.contains(Character.toUpperCase(lo.get(k)))){
                        val=false;
                        break;
                    }
                }
            }
            if(val && st.length()>maxlen){
                maxlen=st.length();
                res=st;
            }
        }
        return res;
    }
}