class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<String>st=new ArrayList<>();
        int n=score.length;
        int[] org=new int[n];
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            org[i]=score[i];
        }
        Arrays.sort(score);
        for(int i=0;i<n;i++){
            temp[i]=score[n-i-1];
        }
        LinkedHashMap<Integer,Integer>a=new LinkedHashMap<>();
        LinkedHashMap<Integer,Integer>val=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            a.put(temp[i],i+1);
        }
        for(int i=0;i<n;i++){
            if(a.containsKey(org[i])){
                val.put(org[i],a.get(org[i]));
            }
        }
        for(Map.Entry<Integer,Integer>b:val.entrySet()){
            if(b.getValue()==1){
                st.add("Gold Medal");
            }
            else if(b.getValue()==2){
                st.add("Silver Medal");
            }
            else if(b.getValue()==3){
                st.add("Bronze Medal");
            }
            else{
                st.add(Integer.toString(b.getValue()));
            }
        }
        String[] res=new String[st.size()];
        for(int i=0;i<st.size();i++){
            res[i]=st.get(i);
        }
        return res;
    }
}