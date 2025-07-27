class Solution {
    public boolean isAcronym(List<String> words, String s) {
       StringBuilder a=new StringBuilder();
       for(int i=0;i<words.size();i++){
        a.append(words.get(i).charAt(0));
       } 
       String strcheck=a.toString();
       return strcheck.equals(s);
    }
}