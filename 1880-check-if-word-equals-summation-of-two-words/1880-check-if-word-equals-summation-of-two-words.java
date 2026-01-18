class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<firstWord.length();i++){
            s1.append(firstWord.charAt(i)-'a');
        }
        StringBuilder s2=new StringBuilder();
        for(int j=0;j<secondWord.length();j++){
            s2.append(secondWord.charAt(j)-'a');
        }
        StringBuilder s3=new StringBuilder();
        for(int i=0;i<targetWord.length();i++){
            s3.append(targetWord.charAt(i)-'a');
        }
        int a=Integer.parseInt(s1.toString());
        int b=Integer.parseInt(s2.toString());
        int c=Integer.parseInt(s3.toString());
        int val=a+b;
        if(val==c){
            return true;
        }
        return false;

    }
}