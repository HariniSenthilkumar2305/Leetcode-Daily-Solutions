class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int j=0;j<nums2.length;j++){
            if(map.containsKey(nums2[j]) && map.get(nums2[j])>0){
                a.add(nums2[j]);
                map.put(nums2[j],map.get(nums2[j])-1);
            }
        }
        int[] res=new int[a.size()];
        for(int i=0;i<res.length;i++){
            res[i]=a.get(i);
        }
        return res;
    }
}