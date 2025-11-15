class Solution {
    public boolean checkZeroOnes(String s) {
        List<String>l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String substr=s.substring(i,j+1);
                HashSet<Character>hs=new HashSet<>();
                for(int k=0;k<substr.length();k++){
                    hs.add(substr.charAt(k));
                }
                if(hs.size()==1){
                    l.add(substr);
                }
                else{
                    break;
                }
            }
        }
        int len1=0;
        int len0=0;
        for(int i=0;i<l.size();i++){
            String val=l.get(i);
            if(val.charAt(0)=='1'){
                len1=Math.max(len1,val.length());
            }
            else if(val.charAt(0)=='0'){
                len0=Math.max(len0,val.length());
            }
        }
        return len1>len0;
    }
}