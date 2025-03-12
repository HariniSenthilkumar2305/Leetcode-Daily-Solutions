class Solution {
    public int findComplement(int num) {
        StringBuilder strbinary=new StringBuilder();
        while(num>0){
            int val=num%2;
            strbinary.append(val);
            num=num/2;
        }
        strbinary.reverse();
        String strbin=strbinary.toString();
        char[] ch=strbin.toCharArray(); 
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                ch[i]='0';
            }
            else if(ch[i]=='0'){
                ch[i]='1';
            }
        }
        String flippedstr=new String(ch);
        int val=Integer.parseInt(flippedstr,2);
        return val;
    }
}