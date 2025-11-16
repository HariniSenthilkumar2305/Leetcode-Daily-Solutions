class Solution {
    public int maximumLengthSubstring(String s) {
        List<String>l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String substr=s.substring(i,j+1);
                l.add(substr);
            }
        }
        int len=0;
        for(int i=0;i<l.size();i++){
            String str=l.get(i);
            HashMap<Character,Integer>mp=new HashMap<>();
            for(int j=0;j<str.length();j++){
                mp.put(str.charAt(j),mp.getOrDefault(str.charAt(j),0)+1);
            }
            boolean val=true;
            for(Map.Entry<Character,Integer>b:mp.entrySet()){
                if(b.getValue()>2){
                    val=false;
                    break;
                }
            }
            if(val){
                len=Math.max(len,str.length());
            }
        }
        return len;
    }
}