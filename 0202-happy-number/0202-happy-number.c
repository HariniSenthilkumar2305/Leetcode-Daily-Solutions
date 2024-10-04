bool isHappy(int n) {
    if(n==1){
        return true;
    }
   else if(n==2 || n==3 || n==4 || n==5 || n==6 || n==8 || n==9){
        return false;
    }
    else{
        int first = n;
            int second = n;
        do{
            first=Happynum(first);
            second=Happynum(Happynum(second));
        }while(first != second);
        return first==1;
    }
}
int Happynum(int n){
    int sum=0,rem;
  while(n>0){
        rem=n%10;
        sum=sum+(rem*rem);
        n=n/10;
    }
    return sum;
    }
