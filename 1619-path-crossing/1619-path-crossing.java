class Solution {
    public boolean isPathCrossing(String path) {
      HashSet<String>a=new HashSet<>();
      int x=0,y=0;
      a.add(x+"+"+y);
      for(int i=0;i<path.length();i++){
        char ch=path.charAt(i);
        if(ch=='N')y+=1;
        else if(ch=='S')y-=1;
        else if(ch=='E')x+=1;
        else if(ch=='W')x-=1;
        String pos=x+"+"+y;
        if(a.contains(pos)){
            return true;
        }
        a.add(pos);
      }
      return false;
    }
}