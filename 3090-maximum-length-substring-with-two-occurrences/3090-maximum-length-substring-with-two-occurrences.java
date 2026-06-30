class Solution {
    public int maximumLengthSubstring(String s) {
        ArrayList<String>l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String substr=s.substring(i,j+1);
                l.add(substr);
            }
        }
        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<l.size();i++){
            String val=l.get(i);
            HashMap<Character,Integer>hp=new HashMap<>();
            for(int j=0;j<val.length();j++){
                hp.put(val.charAt(j),hp.getOrDefault(val.charAt(j),0)+1);
            }
            boolean v=true;
            for(Map.Entry<Character,Integer>e:hp.entrySet()){
                if(e.getValue()>2){
                    v=false;
                    break;
                }
            }
            if(v){
                maxlen=Math.max(maxlen,val.length());
            }
        }
        return maxlen;
    }
}