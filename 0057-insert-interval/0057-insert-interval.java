class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        ArrayList<int[]>res=new ArrayList<>();
       int i=0;
       for(;i<intervals.length&&intervals[i][1]<newInterval[0];i++){
        res.add(intervals[i]);
       }
       for(;i<intervals.length&&intervals[i][0]<=newInterval[1];i++){
        newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
        newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
       }
       res.add(newInterval);
       for(;i<intervals.length;i++){
        res.add(intervals[i]);
       }
       int[][] result=new int[res.size()][2];
       for(i=0;i<res.size();i++){
        result[i]=res.get(i);
       }
       return result;
    }
}