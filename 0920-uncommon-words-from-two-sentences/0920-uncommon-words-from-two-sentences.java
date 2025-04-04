class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String>str=new ArrayList<>();
        s1=s1+" "+s2;
        String[] val=s1.split(" ");
        HashMap<String,Integer>mp=new HashMap<>();
        for(int i=0;i<val.length;i++){
            mp.put(val[i],mp.getOrDefault(val[i],0)+1);
        }
        for(Map.Entry<String,Integer>a:mp.entrySet()){
            if(a.getValue()==1){
                str.add(a.getKey());
            }
        }
        String[] strval=new String[str.size()];
        for(int i=0;i<strval.length;i++){
            strval[i]=str.get(i);
        }
        return strval;
    }
}