class Solution {
    public int tupleSameProduct(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int result=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int x=nums[i]*nums[j];
                map.put(x,map.getOrDefault(x,0)+1);
                
            }
        }
        int ans=0;
        for(int i: map.values()){
            if(i>1){
                ans+=(i*(i-1))/2;
            }
            
        }
        return ans*8;
    }
}