class Solution {
    public int strStr(String haystack, String needle) {
      if(needle.isEmpty()){
            return 0;
        }
        int haystacklength=haystack.length();
        int needlelength=needle.length();
        int haystackPointer=0;
        int needlePointer=0;
        while(haystackPointer<haystacklength){
            if(haystack.charAt(haystackPointer)==needle.charAt(needlePointer)){
            if(needlelength==1){
                return haystackPointer;
            }
            haystackPointer++;
            needlePointer++;
            }
            else{
                haystackPointer-=needlePointer-1;
                needlePointer=0;
            }
            
        
        if(needlePointer==needlelength){
            return haystackPointer-needlePointer;
        }
     
    }
   return -1;
    }
}