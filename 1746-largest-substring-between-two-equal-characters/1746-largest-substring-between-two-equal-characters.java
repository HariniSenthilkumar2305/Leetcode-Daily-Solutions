class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        List<String>l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String substr=s.substring(i,j+1);
                l.add(substr);
            }
        }
        int len=-1;
        for(int i=0;i<l.size();i++){
            String str=l.get(i);
            if(str.charAt(0)==str.charAt(str.length()-1)){
                len=Math.max(len,str.length()-2);
            }
        }
        return len;
    }
}