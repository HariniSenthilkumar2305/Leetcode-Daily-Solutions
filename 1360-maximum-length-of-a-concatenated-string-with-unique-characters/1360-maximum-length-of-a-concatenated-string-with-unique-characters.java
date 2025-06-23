class Solution {
    public int maxLength(List<String> arr) {
        int maxlen=0;
        List<List<String>>subseq=new ArrayList<>();
        subseq.add(new ArrayList<>());
        for(String s:arr){
            List<List<String>>newseq=new ArrayList<>();
            for(int i=0;i<subseq.size();i++){
                List<String>newlist=new ArrayList<>(subseq.get(i));
                newlist.add(s);
                newseq.add(newlist);
            }
            subseq.addAll(newseq);
        }
        for(int i=0;i<subseq.size();i++){
            List<String>exislist=new ArrayList<>(subseq.get(i));
            StringBuilder s=new StringBuilder();
            for(int j=0;j<exislist.size();j++){
                s.append(exislist.get(j));
            }
            HashMap<Character,Integer>mp=new HashMap<>();
            for(int k=0;k<s.length();k++){
                mp.put(s.charAt(k),mp.getOrDefault(s.charAt(k),0)+1);
            }
            boolean val=true;
            for(Map.Entry<Character,Integer>b:mp.entrySet()){
                if(b.getValue()>1){
                    val=false;
                    break;
                }
            }
            if(val){
                if(s.length()>maxlen){
                    maxlen=s.length();
                }
            }
        }
        return maxlen;
    }
}