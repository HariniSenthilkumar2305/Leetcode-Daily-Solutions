class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        int count = 1;
        int index = 1; 

        a.add(nums[0]); 

        for (int i = 1; i < nums.length; i++) {
            if (a.contains(nums[i])) { 
                if (count < 2) { 
                    nums[index++] = nums[i];
                    count++;
                }
            } else { 
                a.add(nums[i]);
                nums[index++] = nums[i]; 
                count = 1; 
            }
        }
        return index; 
    }
}
