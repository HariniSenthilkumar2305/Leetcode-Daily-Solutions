class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer>b:mp.entrySet()){
            if(b.getValue()==1){
                sum+=b.getKey();
            }
        }
        return sum;
    }
}