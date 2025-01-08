class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
             a.put(nums[i], a.getOrDefault(nums[i], 0) + 1);
        }
    PriorityQueue<Integer>minheap =new PriorityQueue<>((p,q)->a.get(p)-a.get(q));
       for(int nums1:a.keySet()){
        minheap.add(nums1);
        if(minheap.size()>k){
        minheap.poll();
       }
       }
        int[] res1=new int[k];
       int i=0;
       while(!minheap.isEmpty()){
        res1[i++]=minheap.poll();

       }
       return res1;
    }
}