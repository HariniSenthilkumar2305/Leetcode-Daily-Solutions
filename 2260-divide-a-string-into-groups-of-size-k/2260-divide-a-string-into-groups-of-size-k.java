class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String>l=new ArrayList<>();
        int a=-1;
        for(int i=0;i<s.length();i+=k){
            int len=i+k;
            if(len<=s.length()){
                String st=s.substring(i,len);
                l.add(st);
            }
            else{
                a=i;
                break;
            }
        }
        if(a!=-1){
            StringBuilder st=new StringBuilder();
            for(int i=a;i<s.length();i++){
                st.append(s.charAt(i));
            }
            while(st.length()<k){
                st.append(fill);
            }
            l.add(st.toString());
        }
        String[] str1=new String[l.size()];
        for(int i=0;i<l.size();i++){
            str1[i]=l.get(i);
        }
        return str1;
    }
}