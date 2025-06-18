class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        String[] str1=new String[str.length];
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length;i++){
            StringBuilder a=new StringBuilder(str[i]);
            str1[i]=a.reverse().toString();
        }
        for(int i=0;i<str1.length;i++){
            res.append(str1[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}