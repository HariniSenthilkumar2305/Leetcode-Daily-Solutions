class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        List<Integer>res=new ArrayList<>();
        Stack<Integer>a=new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(a.size()!=2){
                a.push(nums[i]);
            }
            else{
            while(a.size()>0){
                int val=a.pop();
                res.add(val);
            }
            a.push(nums[i]);
            }
        }
        while(!a.isEmpty()){
            res.add(a.pop());
        }
        int[]arr=new int[res.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
}