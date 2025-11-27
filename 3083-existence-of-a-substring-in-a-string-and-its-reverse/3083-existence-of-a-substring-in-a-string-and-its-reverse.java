class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder st=new StringBuilder(s);
        String s1=st.reverse().toString();
        List<String>l1=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String str1=s.substring(i,j+1);
                if(str1.length()>=2){
                    l1.add(str1);
                }
            }
        }
        List<String>l2=new ArrayList<>();
       for(int i=0;i<s1.length();i++){
            for(int j=i;j<s1.length();j++){
                String str2=s1.substring(i,j+1);
                if(str2.length()>=2){
                    l2.add(str2);
                }
            }
        }
        for(int i=0;i<l1.size();i++){
            if(l2.contains(l1.get(i))){
                return true;
            }
        }
        return false;
    }
}