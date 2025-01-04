class Solution {
    public int myAtoi(String s) {
        int sign=1;
        int res=0;
        int i=0;
        s=s.trim();
        if(s.isEmpty()){
            return 0;
        }
        if(s.charAt(i)=='-'){
          sign=-1;
          i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10)){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res=res*10+digit;
            i++;
        }
        return res*sign;
    }
}