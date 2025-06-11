class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        HashSet<Integer>a=new HashSet<>();
        for(int l:nums){
            a.add(l);
        }
        int val=0;
        for(int i=0;i<=n;i++){
            if(!a.contains(i)){
                val=i;
            }
        }
        return val;
    }
}