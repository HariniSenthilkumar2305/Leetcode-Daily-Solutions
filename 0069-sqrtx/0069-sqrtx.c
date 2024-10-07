int mySqrt(int x) {
 if(x<2){
    return x;
 }   
 int l=1,r=x;
 while(l<=r){
    int mid=l+(r-l)/2;
    long long sqr=(long long)mid*mid;
    if(sqr==x)
        return mid;
    else if(sqr<x)
        l=mid+1;
    else
        r=mid-1;
 }
 return r;
}