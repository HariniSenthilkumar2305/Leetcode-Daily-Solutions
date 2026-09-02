class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder st1=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            st1.append(word1[i]);
        }
        StringBuilder st2=new StringBuilder();
        for(int i=0;i<word2.length;i++){
            st2.append(word2[i]);
        }
        String val1=st1.toString();
        String val2=st2.toString();
        if(val1.equals(val2)){
            return true;
        }
        return false;
    }
}