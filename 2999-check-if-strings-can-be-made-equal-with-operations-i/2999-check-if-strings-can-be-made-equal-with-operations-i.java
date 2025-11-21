class Solution {
    public boolean canBeEqual(String s1, String s2) {
        List<Character>le1=new ArrayList<>();
        List<Character>le2=new ArrayList<>();
        List<Character>lo1=new ArrayList<>();
        List<Character>lo2=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                le1.add(s1.charAt(i));
            }
            else{
                lo1.add(s1.charAt(i));
            }
        }
         for(int i=0;i<s2.length();i++){
            if(i%2==0){
                le2.add(s2.charAt(i));
            }
            else{
                lo2.add(s2.charAt(i));
            }
        }
        boolean val1=true;
        for(int i=0;i<le1.size();i++){
            if(!le2.contains(le1.get(i))){
                val1=false;
                break;
            }
        }
        boolean val2=true;
        for(int i=0;i<lo1.size();i++){
            if(!lo2.contains(lo1.get(i))){
                val2=false;
                break;
            }
        }
        return val1&&val2;
    }
}