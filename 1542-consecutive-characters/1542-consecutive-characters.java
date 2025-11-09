class Solution {
    public int maxPower(String s) {
        ArrayList<String>a=new ArrayList<>();
        int len=1;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i;j<s.length();j++){
                String substr=s.substring(i,j+1);
                HashSet<Character>st=new HashSet<>();
                for(int k=0;k<substr.length();k++){
                    st.add(substr.charAt(k));
                }
                if(st.size()==1){
                    len=Math.max(len,substr.length());
                }
                else{
                    break;
                }
            }
        }
        return len;
    }
}