class Solution {
    public String[] findWords(String[] words) {
        int n=words.length;
       String a="qwertyuiop";
       String b="asdfghjkl";
       String c="zxcvbnm"; 
       List<String>res=new ArrayList<>();
       for(String word:words){
        if(cantyped(word,a) || cantyped(word,b) || cantyped(word,c)){
            res.add(word);
        }
       }
       return res.toArray(new String[0]);
    }
    public boolean cantyped(String word,String row){
        for(char c:word.toCharArray()){
            if(row.indexOf(Character.toLowerCase(c))==-1){
                return false;
            }
        }
        return true;
    }
}