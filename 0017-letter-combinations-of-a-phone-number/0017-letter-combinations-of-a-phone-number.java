class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        if(digits.isEmpty()){
            return ans;
        }
        Map<Integer,String>val=new HashMap<>();
        val.put(2,"abc");
        val.put(3,"def");
        val.put(4,"ghi");
        val.put(5,"jkl");
        val.put(6,"mno");
        val.put(7,"pqrs");
        val.put(8,"tuv");
        val.put(9,"wxyz");
        List<List<String>>lettcomb=new ArrayList<>();
        for(char digit:digits.toCharArray()){
           int key=Character.getNumericValue(digit);
           if(val.containsKey(key)){
            List<String>singcomb=new ArrayList<>();
            singcomb.add(val.get(key));
            lettcomb.add(singcomb);
           }
        }
        ans=generateCombination(lettcomb);
        return ans;
    }
        public static List<String> generateCombination(List<List<String>> lettcomb){
            List<String>result=new ArrayList<>();
            if(lettcomb==null || lettcomb.isEmpty()){
                return result;
            }
            combine(lettcomb,0,"",result);
            return result;
        }
        public static void combine(List<List<String>> lettcomb,int index,String curr,List<String> result){  
            if(index==lettcomb.size()){
                result.add(curr);
                return ;
            }
            for(char c:lettcomb.get(index).get(0).toCharArray()){
                combine(lettcomb,index+1,curr+c,result);
            }
        }
}