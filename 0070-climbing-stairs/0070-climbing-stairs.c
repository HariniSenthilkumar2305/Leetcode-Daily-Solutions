int climbStairs(int n) {
int i=0,j=1,count=0,k;
while(count!=n){
k=i+j;
i=j;
j=k;
count++;
}
return k;
}