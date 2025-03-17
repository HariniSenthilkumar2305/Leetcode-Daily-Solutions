class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        ArrayList<Integer>Both=new ArrayList<>();
        int[]res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Both.addAll(even);
        Both.addAll(odd);
        for(int i=0;i<res.length;i++){
           res[i]=Both.get(i);
        }
        return res;
    }
}