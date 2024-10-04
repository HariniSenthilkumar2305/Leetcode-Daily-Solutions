void moveZeroes(int* nums, int numsSize) {
    int i,j,count=0;
    int temp;
       for(i=0;i<numsSize;i++){ 
            if(nums[i]!=0){
             nums[count]=nums[i];
             count++;
            }
        }
        for(i=count;i<numsSize;i++){
            nums[i]=0;
        }
}