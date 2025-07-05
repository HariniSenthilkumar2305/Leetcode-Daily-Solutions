class Solution {
    public int findLucky(int[] arr) {

       HashMap<Integer,Integer>mp=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
       } 
       List<Integer>a=new ArrayList<>();
       for(Map.Entry<Integer,Integer>b:mp.entrySet()){
        if(b.getKey()==b.getValue()){
         a.add(b.getKey());   
        }
       }
       Collections.sort(a);
       if(a.size()>0){
        return a.get(a.size()-1);
       }
       return -1;
    }
}