class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int maxfreq=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer>b:mp.entrySet()){
            maxfreq=Math.max(maxfreq,b.getValue());
        }
        int cnt=0;
        for(Map.Entry<Integer,Integer>a:mp.entrySet()){
            if(a.getValue()==maxfreq){
                cnt+=a.getValue();
            }
        }
        return cnt;
    }
}