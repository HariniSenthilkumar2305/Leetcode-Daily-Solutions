class Solution {
    public int minAddToMakeValid(String s) {
       Stack<Character>st=new Stack<>();
       for(char ch:s.toCharArray())
if(ch=='('){
    st.push(ch);
}
else if(ch==')'&&!st.isEmpty()){
    if(st.peek()=='('){
        st.pop();
    }
    else{
       st.push(ch);
    }
}
else{
    st.push(ch);
}
return st.size();
    }
}