class Solution {
    public String reformatNumber(String number) {
        StringBuilder realnum=new StringBuilder();
        for(int i=0;i<number.length();i++){
            if(Character.isDigit(number.charAt(i))){
                realnum.append(number.charAt(i));
            }
        }
        String r=realnum.toString();
        StringBuilder res=new StringBuilder();
        int l=0;
        while(l<r.length()){
            int remain=r.length()-l;
            if(remain>4){
                res.append(r.substring(l,l+3)).append("-");
                l+=3;
            }
            else if(remain==4){
                res.append(r.substring(l,l+2)).append("-");
                res.append(r.substring(l+2,l+4));
                break;
            }
            else{
                res.append(r.substring(l,r.length()));
                break;
            }
        }
        return res.toString();
    }
}