
class Solution {
    public String average(int arr[]) {
        // code here
        double sum=0;
        double avg;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=sum/arr.length;
        //String s=String.valueOf(avg);
        return String.format("%.2f", avg);
        
    }
}