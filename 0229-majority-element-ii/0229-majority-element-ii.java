class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer>res=new ArrayList<>();
        LinkedHashMap<Integer,Integer>a=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>b:a.entrySet()){
            if(b.getValue()>(n/3)){
                res.add(b.getKey());
            }
        }
        return res;
    }
}