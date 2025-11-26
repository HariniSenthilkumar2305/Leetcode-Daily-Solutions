class Solution {
    public String generateTheString(int n) {
        StringBuilder st=new StringBuilder();
        HashMap<Character,Integer>mp=new HashMap<>();
         for(int i=0;i<n;i++){
            st.append('a');
            mp.put('a',mp.getOrDefault('a',0)+1);
         }
         if(n%2==0){
            st.setCharAt(n-1,'b');
            mp.put('a',mp.get('a')-1);
            mp.put('b',mp.getOrDefault('b',0)+1);
         }
        return st.toString();
    }
}