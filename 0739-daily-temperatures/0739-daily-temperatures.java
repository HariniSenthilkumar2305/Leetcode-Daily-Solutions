class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    int[] answer=new int[temperatures.length];
    int n=temperatures.length-1;
    Stack<Integer>index=new Stack<>();
   for(int i=n;i>=0;i--){
    while(!index.isEmpty() && temperatures[index.peek()]<=temperatures[i]){
        index.pop();
    }
    answer[i]=index.isEmpty()?0:index.peek()-i;
    index.push(i);
   }
   return answer;
    }  
}