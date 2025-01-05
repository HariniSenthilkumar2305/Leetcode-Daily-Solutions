class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      List<Integer> result = new ArrayList<>();
     for(int i=0;i<m;i++){
        result.add(nums1[i]);
     }
     for(int j=0;j<n;j++){
        result.add(nums2[j]);
     }
     for(int i=0;i<m+n;i++){
        nums1[i]=result.get(i);
     }
    Arrays.sort(nums1);
    }
}