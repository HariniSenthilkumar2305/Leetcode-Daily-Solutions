class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        List<Integer>a=Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer>b=Arrays.stream(nums2).boxed().collect(Collectors.toList());
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<a.size();i++){
            if(b.contains(a.get(i))){
                cnt1++;
            }
        }
        for(int i=0;i<b.size();i++){
            if(a.contains(b.get(i))){
                cnt2++;
            }
        }
        int[] res=new int[2];
        res[0]=cnt1;
        res[1]=cnt2;
        return res;
    }
}