class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>a=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    a.add(nums1[i]);
                }
            }
        }
        ArrayList<Integer>b=new ArrayList<Integer>(a);
        int[] res=new int[a.size()];
        for(int i=0;i<b.size();i++){
            res[i]=b.get(i);
        }
        return res;
    }
}