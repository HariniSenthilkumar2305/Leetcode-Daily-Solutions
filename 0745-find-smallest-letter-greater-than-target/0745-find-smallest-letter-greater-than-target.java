class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        HashMap<Character,Integer>let=new HashMap<>();
        char res=letters[0];
        for(int i=0;i<letters.length;i++)
        {
        let.put(letters[i],(int)letters[i]);
        }
        HashMap<Character,Integer>tar=new HashMap<>();
        tar.put(target,(int)target);
        int minVal=Integer.MAX_VALUE;
        char ch='\u0000';
        for(Map.Entry<Character,Integer>a:let.entrySet()){
            if(a.getValue()>tar.get(target) && a.getValue()<minVal){
                minVal=a.getValue();
                ch=a.getKey();
            }
        }
        if(ch!='\u0000'){
            return ch;
        }
        return res;
}
}