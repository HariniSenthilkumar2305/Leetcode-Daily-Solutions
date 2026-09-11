class Solution {
    public int sumOfUnique(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>h:hm.entrySet()){
            if(h.getValue()==1){
                a.add(h.getKey());
            }
        }
        int sum=0;
        for(int i=0;i<a.size();i++){
            sum+=a.get(i);
        }
        return sum;
    }
}