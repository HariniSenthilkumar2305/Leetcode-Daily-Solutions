class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<num.length();i++){
            mp.put(num.charAt(i)-'0',mp.getOrDefault(num.charAt(i)-'0',0)+1);
        }
        boolean val=true;
        for(int i=0;i<num.length();i++){
            if(mp.containsKey(i)){
                if(mp.get(i)!=num.charAt(i)-'0'){
                    return false;
                }
            }
            else{
                if(num.charAt(i)-'0'!=0){
                    return false;
                }
            }
        }
        return val;
    }
}