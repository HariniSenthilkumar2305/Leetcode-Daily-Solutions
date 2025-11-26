class Solution {
    public int numDifferentIntegers(String word) {
        String replacedstr=word.replaceAll("[^0-9]"," ");
        String[] str=replacedstr.split(" ");
         HashSet<String>hs=new HashSet<>();
        for(int i=0;i<str.length;i++){
            if(!str[i].equals("")){
              hs.add(str[i].replaceFirst("^0+(?!$)",""));  
            }
        }
        return hs.size();
    }
}