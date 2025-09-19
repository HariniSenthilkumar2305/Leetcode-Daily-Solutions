class Solution {
    public double average(int[] salary) {
        List<Integer>a=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<salary.length;i++){
            max=Math.max(max,salary[i]);
            min=Math.min(min,salary[i]);
        }
        for(int i=0;i<salary.length;i++){
            if(salary[i]!=max && salary[i]!=min){
                a.add(salary[i]);
            }
        }
        int sum=0;
        for(int i=0;i<a.size();i++){
            sum+=a.get(i);
        }
        double val=(double)sum/a.size();
        return val;
    }
}