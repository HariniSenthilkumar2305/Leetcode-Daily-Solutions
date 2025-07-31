class Solution {
    public String removeDigit(String number, char digit) {
        String maxval="";
        char deletedch='\0';
        String di=String.valueOf(digit);
        StringBuilder s=new StringBuilder(number);
        StringBuilder d=new StringBuilder(di);
        String result = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==d.charAt(0)){
                StringBuilder temp = new StringBuilder(s);
                deletedch=temp.charAt(i);
                temp.deleteCharAt(i);
                String num=temp.toString();
                if(num.compareTo(maxval)>0){
                    maxval=num;
                    result = temp.toString();
                }
            }
        }
        return result;
    }
}
