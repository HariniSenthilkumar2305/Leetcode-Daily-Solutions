class Solution {
    public int countGoodSubstrings(String s) {
        int cnt=0;
        ArrayList<String>a=new ArrayList<>();
        for(int i=0;i<s.length()-2;i++){
            for(int j=i+1;j<s.length();j++){
                String val=s.substring(i,j+1);
                a.add(val);
            }
        }
        for(int i=0;i<a.size();i++){
            String v=a.get(i);
            if(v.length()==3){
                HashSet<Character>hs=new HashSet<>();
                for(int j=0;j<v.length();j++){
                    hs.add(v.charAt(j));
                }
                if(hs.size()==3){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}