class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>a=new ArrayList<>();
        int size=nums.length/3;
      HashMap<Integer,Integer>val=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        val.put(nums[i],val.getOrDefault(nums[i],0)+1);
      }
      for(Map.Entry<Integer,Integer>b:val.entrySet()){
        if(b.getValue()>size){
            a.add(b.getKey());
        }
      }
      return a;
    }
}