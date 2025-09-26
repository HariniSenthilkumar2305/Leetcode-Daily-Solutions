class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
     List<List<Integer>>li=new ArrayList<>();
     List<Integer>n1=new ArrayList<>();
     List<Integer>n2=new ArrayList<>();
     for(int i=0;i<nums1.length;i++){
        n1.add(nums1[i]);
     }
     for(int i=0;i<nums2.length;i++){
        n2.add(nums2[i]);
     }
     List<Integer>l1=new ArrayList<>();
     for(int i=0;i<n1.size();i++){
        if(!n2.contains(n1.get(i)) && !l1.contains(n1.get(i))){
            l1.add(n1.get(i));
        }
     }
     List<Integer>l2=new ArrayList<>();
     for(int i=0;i<n2.size();i++){
        if(!n1.contains(n2.get(i)) && !l2.contains(n2.get(i))){
            l2.add(n2.get(i));
        }
     }
      li.add(l1);
      li.add(l2);
      return li;   
    }
}