class Solution {
    public int getLucky(String s, int k) {
       StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            st.append(s.charAt(i)-'a'+1);
        }
        String val=st.toString();
        while(k>0){
            int temp=0;
            for(int i=0;i<val.length();i++){
                temp+=val.charAt(i)-'0';
            }
            k--;
            val=Integer.toString(temp);
        }
      return Integer.parseInt(val);
    }
}