class Solution {
    public int[] frequencySort(int[] nums) {
        int[] arr=new int[nums.length];
        LinkedHashMap<Integer,Integer>mp=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int[] key=new int[mp.size()];
        int[] val=new int[mp.size()];
        int idx=0;
        for(Map.Entry<Integer,Integer>b:mp.entrySet()){
            key[idx]=b.getKey();
            val[idx]=b.getValue();
            idx++;
        }
        List<Integer>r=new ArrayList<>();
        boolean[] visited=new boolean[mp.size()];
        while(r.size()<nums.length){
            int k=-1;
            int minval=Integer.MAX_VALUE;
            for(int i=0;i<val.length;i++){
                if(!visited[i]){
                if(val[i]<minval){
                    k=i;
                    minval=val[i];
                }
                else if(val[i]==minval && k!=-1 && key[i]>key[k]){
                    k=i;
                }
                }
            }
            visited[k]=true;
            int cnt=val[k];
            while(cnt>0){
                r.add(key[k]);
                cnt--;
            }
        }
        for(int i=0;i<r.size();i++){
            arr[i]=r.get(i);
        }
        return arr;
    }
}