class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] res=new int[2];
        HashMap<Integer,Integer>mp=new HashMap<>();
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])==2){
                cnt++;
                mp.put(nums[i],mp.getOrDefault(nums[i],0)-2);
            }
        }
        int sum=0;
        for(Map.Entry<Integer,Integer>b:mp.entrySet()){
            sum+=b.getValue();
        }
        res[0]=cnt;
        res[1]=sum;
        return res;
    }
}