class Solution {
    public int dayOfYear(String date) {
        int[] arr=new int[12];
        int[] arr1=new int[12];
            arr[0]=31;
            arr1[0]=31;
            arr[1]=28;
            arr1[1]=29;
            arr[2]=31;
            arr1[2]=31;
            arr[3]=30;
            arr1[3]=30;
            arr[4]=31;
            arr1[4]=31;
            arr[5]=30;
            arr1[5]=30;
            arr[6]=31;
            arr1[6]=31;
            arr[7]=31;
            arr1[7]=31;
            arr[8]=30;
            arr1[8]=30;
            arr[9]=31;
            arr1[9]=31;
            arr[10]=30;
            arr1[10]=30;
            arr[11]=31;
            arr1[11]=31;
        String[] gnstr=date.split("-");
        int[] gvnarr=new int[3];
        for(int i=0;i<3;i++){
            gvnarr[i]=Integer.parseInt(gnstr[i]);
        }
        int year=gvnarr[0];
        int month=gvnarr[1];
        int day=gvnarr[2];
        int sum=0;
        boolean isleap=(year%400==0) || (year%4==0 && year%100!=0);
            if(isleap){
                if(month>1){
                    for(int j=0;j<month-1;j++){
                        sum+=arr1[j];
                    }
                }
            }
            else{
                if(month>1){
                    for(int j=0;j<month-1;j++){
                        sum+=arr[j];
                    }
                }
            }
        sum+=day;
        return sum;
    }
}