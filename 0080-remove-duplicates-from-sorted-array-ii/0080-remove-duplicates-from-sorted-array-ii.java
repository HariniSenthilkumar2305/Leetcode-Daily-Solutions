class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>a=new HashSet<>();
        int count=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
           if(a.contains(nums[i])){
            if(count<1){
                nums[index]=nums[i];
                index++;
                count++;
            }
           }
           else{
            a.add(nums[i]);
            nums[index]=nums[i];
            index++;
            count=0;
           }
        }
        return index;
    }
}