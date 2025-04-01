class Solution {
    public String convertDateToBinary(String date) {
        String[] str=date.split("-");
        StringBuilder strdate=new StringBuilder();
        for(int i=0;i<str.length;i++){
            if(i!=str.length-1){
                strdate.append(Integer.toBinaryString(Integer.parseInt(str[i])));
                strdate.append("-");
            }
            else{
                strdate.append(Integer.toBinaryString(Integer.parseInt(str[i])));
            }
        }
        return strdate.toString();
    }
}