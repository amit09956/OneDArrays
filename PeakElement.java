//package OneDArray;


public class PeakElement {
    public static int peakElement(int arr[]){
       // if(arr.length==1)return 0;
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if( arr[mid]>arr[mid+1]){
                e=mid;
            }
            else {
                s=mid+1;
            }
           

        }
        return s;
    }
    public static void main(String[]args){
        int arr[]={2,1};
        System.out.println(peakElement(arr));
    }
    
}
//m

