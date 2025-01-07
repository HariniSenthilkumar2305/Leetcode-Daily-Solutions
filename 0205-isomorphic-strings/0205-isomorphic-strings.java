class Solution {
public boolean isIsomorphic(String s, String t) {
         if(s.length()!=t.length()){
            return false;
        }
       HashMap<Character,Character>schar=new HashMap<>();
       HashMap<Character,Character>tchar=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char scharacter=s.charAt(i);
        char tcharacter=t.charAt(i);
        if(schar.containsKey(scharacter)){
            if(schar.get(scharacter)!=tcharacter){
                return false;
            }
        }
        else{
            schar.put(scharacter,tcharacter);
        }
        if(tchar.containsKey(tcharacter)){
            if(tchar.get(tcharacter)!=scharacter){
                return false;
            }
        }
        else{
            tchar.put(tcharacter,scharacter);
        }
       }
       return true;
     }
};