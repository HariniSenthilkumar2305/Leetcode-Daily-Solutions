class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder o=new StringBuilder();
        StringBuilder z=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                o.append(s.charAt(i));
            }
            else{
                z.append(s.charAt(i));
            }
        }
        String on=o.toString();
        String ze=z.toString();
        StringBuilder v=new StringBuilder();
        for(int i=0;i<on.length()-1;i++){
            v.append(on.charAt(i));
        }
        for(int j=0;j<ze.length();j++){
            v.append(ze.charAt(j));
        }
        v.append(on.charAt(on.length()-1));
        return v.toString();
    }
}