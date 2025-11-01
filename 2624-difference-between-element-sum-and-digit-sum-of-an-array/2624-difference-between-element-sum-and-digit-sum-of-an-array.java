class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                int v=nums[i]%10;
                a.add(v);
                nums[i]=nums[i]/10;
            }
        }
        int sum1=0;
        for(int i=0;i<a.size();i++){
            sum1+=a.get(i);
        }
        return Math.abs(sum1-sum);
    }
}