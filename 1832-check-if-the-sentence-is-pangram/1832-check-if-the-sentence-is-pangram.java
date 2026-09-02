class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character>hs=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            hs.add(sentence.charAt(i));
        }
        boolean val=true;
        for(char ch='a';ch<='z';ch++){
            if(!hs.contains(ch)){
                return false;
            }
        }
        return true;
    }
}