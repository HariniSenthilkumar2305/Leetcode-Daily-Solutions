class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        generateparentheses(n,0,0,"",result);
        return result;
    }
    private void generateparentheses(int n,int open,int close,String current,List<String> result){
        if(current.length()==n*2){
            result.add(current);
            return;
        }
        if(open<n){
            generateparentheses(n,open+1,close,current+"(",result);
        }
        if(close<open){
            generateparentheses(n,open,close+1,current+")",result);
        }
    }
}