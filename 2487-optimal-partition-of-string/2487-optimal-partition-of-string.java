class Solution {
    public int partitionString(String s) {
        int n=s.length();
        Set<Character>set=new HashSet<>();
        int i=0;
        int count=0;
        while(i<n){
            set.clear();
            while(i<n && !set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                i++;
            }
            count++;
        }
        return count;
        }
    }