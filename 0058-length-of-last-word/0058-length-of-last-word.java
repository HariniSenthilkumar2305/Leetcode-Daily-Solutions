class Solution {
    public int lengthOfLastWord(String s) {
        String[] wordcount;
        String word;
        wordcount=s.split("\\s+");
       word=wordcount[wordcount.length-1];
          return word.length();
    }
 
}