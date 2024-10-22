bool checkRecord(char* s) {
    int i,count=0,count1=0;
    for(i=0;i<strlen(s);i++){
      if(s[i]=='A'){
        count++;
        if(count>=2)
            return false;
      }
      if(s[i]=='L'){
        count1++;
        if(count1>=3)
            return false;
      }
      else{
        count1=0;
      }
    }
    return true;
}