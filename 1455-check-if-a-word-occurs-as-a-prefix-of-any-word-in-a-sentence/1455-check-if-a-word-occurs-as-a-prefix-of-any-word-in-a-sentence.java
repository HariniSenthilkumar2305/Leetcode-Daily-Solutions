class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] st=sentence.split(" ");
        ArrayList<String>hs=new ArrayList<>();
        for(int i=0;i<st.length;i++){
            hs.add(st[i]);
        }
        for(int j=0;j<hs.size();j++){
            String val=hs.get(j);
            for(int k=val.length()-1;k>=0;k--){
                String v=val.substring(0,k+1);
                if(v.equals(searchWord)){
                    return j+1;
                }
            }
        }
        return -1;
    }
}