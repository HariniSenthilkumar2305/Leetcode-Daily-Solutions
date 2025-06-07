class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res=new int[2];
        List<Integer>val=new ArrayList<>();
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>b:a.entrySet()){
            if(b.getValue()==1){
                val.add(b.getKey());
            }
        }
        for(int i=0;i<val.size();i++){
            res[i]=val.get(i);
        }
        return res;
    }
}