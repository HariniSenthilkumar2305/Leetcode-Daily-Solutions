class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        List<Integer>res=new ArrayList<>();
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>b:a.entrySet()){
            if(b.getValue()>1){
                res.add(b.getKey());
            }
        }
        int sum=0;
        for(int i=0;i<res.size();i++){
            sum^=res.get(i);
        }
        return sum;
    }
}