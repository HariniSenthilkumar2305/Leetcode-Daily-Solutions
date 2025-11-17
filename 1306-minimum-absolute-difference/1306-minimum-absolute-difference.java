class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>l=new ArrayList<>();
        int mindiff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
                mindiff=Math.min(mindiff,arr[i]-arr[i-1]);
        }
        for(int i=1;i<arr.length;i++){
                List<Integer>li=new ArrayList<>();
                if(arr[i]-arr[i-1]==mindiff){
                    li.add(arr[i-1]);
                    li.add(arr[i]);
                    l.add(li);
                }
        }
        return l;
    }
}