class Solution {
    public String longestPalindrome(String s) {
        int max=Integer.MIN_VALUE;
        int[] index=new int[2];
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(palindrome(s,i,j)){
                    if(j-i+1>max){
                        max=j-i+1;
                        index[0]=i;
                        index[1]=j;
                    }
                }
            }
        }
        return s.substring(index[0],index[1]+1);
    }
    public boolean palindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
