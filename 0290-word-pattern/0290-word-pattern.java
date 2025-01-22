class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        HashMap<Character,String>a=new HashMap<>();
        if(pattern.length()!=str.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            String CharVal=a.get(pattern.charAt(i));
            if(CharVal!=null){
                if(!CharVal.equals(str[i])){
                    return false;
                }
            }
            else if(!a.containsValue(str[i])){
                a.put(pattern.charAt(i),str[i]);
            }
            else{
                return false;
            }
        }
        return true;
    }
}