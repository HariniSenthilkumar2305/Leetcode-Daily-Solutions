class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer>st=new HashSet<>();
        for(Map.Entry<Integer,Integer>a:mp.entrySet()){
            if(st.contains(a.getValue()))return false;
            st.add(a.getValue());
        }
        return true;
    }
}